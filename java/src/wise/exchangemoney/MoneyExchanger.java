package wise.exchangemoney;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MoneyExchanger {

    public MoneyExchanger(RateService rateService) {
        this.rateService = rateService;
    }

    private final Map<CurrencyPair, Rate> rateStorage = new ConcurrentHashMap<>();
    private final RateService rateService;


    public BigDecimal convert(Curency fromCurrency, Curency toCurrency, int amount) {
        CurrencyPair key = new CurrencyPair(fromCurrency, toCurrency);
        Rate rate = rateStorage.get(key);
        if (rate == null || rate.validTill < OffsetDateTime.now().toEpochSecond()) {
            BigDecimal newRate = rateService.getRate(key.from, key.to);
            rate = new Rate(newRate, OffsetDateTime.now().plusSeconds(60).toEpochSecond());
            rateStorage.put(key, rate);
        }

        return BigDecimal.valueOf(amount).multiply(rate.rate);
    }

    enum Curency {
        RUB, EUR, USD
    }

    record CurrencyPair(Curency from, Curency to) {
    }

    record Rate(BigDecimal rate, Long validTill) {
    }

    interface RateService {
        BigDecimal getRate(Curency from, Curency to);
    }
}
