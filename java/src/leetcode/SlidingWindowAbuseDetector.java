package leetcode;

import java.util.*;

public class SlidingWindowAbuseDetector {

    record Event(int userId, long timestamp){};

    int windowSizeSeconds;
    int threshold;
    HashMap<Integer, Integer> userToCount;
    Set<Integer> robots;
    LinkedList<Event> events;

    public SlidingWindowAbuseDetector(int windowSizeSeconds, int threshold) {
        this.windowSizeSeconds = windowSizeSeconds;
        this.threshold = threshold;
        this.userToCount = new HashMap<>();
        this.robots = new HashSet<>();
        this.events = new LinkedList<>();
    }

    /**
     * Зарегистрировать событие пользователя userId в момент времени now.
     *
     * @param now неубывающее время события, например Unix timestamp в секундах
     * @param userId идентификатор пользователя
     */
    public void recordEvent(long now, int userId) {
        removeOld(now);
        events.addFirst(new Event(userId, now));
        int counter = userToCount.getOrDefault(userId, 0)+1;
        userToCount.put(userId, counter);
        if (counter >= threshold){
            robots.add(userId);
        }
    }

    /**
     * Вернуть количество пользователей, у которых за последние windowSizeSeconds
     * было не меньше threshold событий.
     *
     * @param now неубывающее время запроса
     */
    public int getAbuserCount(long now) {
        removeOld(now);
        return robots.size();
    }

    void removeOld(long now){
        while(!events.isEmpty()){
            Event last = events.getLast();
            if (last.timestamp < now - windowSizeSeconds){
                events.removeLast();
                int counter = userToCount.get(last.userId)-1;
                if (counter == 0){
                    userToCount.remove(last.userId);
                } else {
                    userToCount.put(last.userId, counter);
                }
                if(counter < threshold){
                    robots.remove(last.userId);
                }
            } else {
                break;
            }
        }
    }
}
