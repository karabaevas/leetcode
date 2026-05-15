package leetcode;

import java.util.*;

public class UserStatistics {
    record Event(long userId, long time){};

    LinkedList<Event> events;
    Map<Long, Long> userCounter = new HashMap<>();
    Set<Long> robots = new HashSet<>();
    int k;
    int limit;

    public UserStatistics(int k, int limit) {
        events = new LinkedList<>();
        this.k = k;
        this.limit = limit;
    }

    public void event(long now, long userId) {
        clearOld(now, k);

        events.addFirst(new Event(userId, now));
        long counter = userCounter.getOrDefault(userId, 0L)+1;
        if(counter == limit){
            robots.add(userId);
        }

        userCounter.put(userId, counter);
    }

    public int robotCount(long now) {
        clearOld(now, k);
        return robots.size();
    }

    void clearOld(long now, long k){
        while(!events.isEmpty() && events.getLast().time < now - k){
            long userId = events.getLast().userId();

            long counter = this.userCounter.get(userId);
            if(counter == limit){
                robots.remove(userId);
            }

            if(counter == 1){
                userCounter.remove(userId);
            } else {
                userCounter.put(userId, counter-1);
            }
            events.removeLast();
        }
    }

}
