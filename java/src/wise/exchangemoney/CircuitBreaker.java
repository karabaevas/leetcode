package wise.exchangemoney;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CircuitBreaker {
    private static final Long keepTime = 10L;
    public static final Long errorLimit = 5L;

    private final Map<String, LinkedList<Long>> errorStoragePerService = new HashMap<>();
    //    private final LinkedList<Long> errors = new LinkedList<>();
    private final HttpClient client;

    public CircuitBreaker(final HttpClient client) {
        this.client = client;
    }

    public void sendMessage(String service, String message) {
        try {
            if (canSendMessage(service)) {
                String rs = client.sendMessage(service, message);
            } else {
                throw new Exception("Error limit exceeded");
            }
        } catch (Exception ex) {
//            log.error("")
            registerError(service, message);
        }
    }


    private void registerError(String service, String message) {
        synchronized (service.intern()){
            LinkedList<Long> errorsForService = errorStoragePerService.getOrDefault(service, new LinkedList<Long>());
            errorsForService.addFirst(OffsetDateTime.now().toEpochSecond());
            errorStoragePerService.put(service, errorsForService);
            checkStateAndRemoveOld(service);
        }
    }

    private synchronized void checkStateAndRemoveOld(String service) {
        synchronized (service.intern()) {
            LinkedList<Long> errors = errorStoragePerService.get(service);
            Long lastErrorDateTime = errors.getLast();
            if (lastErrorDateTime + keepTime < ZonedDateTime.now().toEpochSecond()) {
                errors.remove(lastErrorDateTime);
            }
        }
    }

    private boolean canSendMessage(String service) {
        LinkedList<Long> errors = errorStoragePerService.get(service);
        boolean canSend = errors.size() < errorLimit;
        if (!canSend) {
            checkStateAndRemoveOld(service);
            canSend = errors.size() < errorLimit;
        }
        return canSend;
    }
}

interface HttpClient {
    String sendMessage(String service, String message);
}
