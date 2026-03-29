package yandex.blind75.habr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex3 {
    //    https://leetcode.com/problems/meeting-rooms-ii/description/
    public static void main(String[] args) {
        Ex3 main = new Ex3();
    }

    record Event(
            int time,
            int value
    ) {
    }

    public int minMeetingRooms(int[][] intervals) {
        List<Event> events = new ArrayList<>();
        for (int I = 0; I < intervals.length; I++) {
            events.add(new Event(intervals[I][0], 1));
            events.add(new Event(intervals[I][1], -1));
        }

        Collections.sort(events, Comparator.comparingInt(Event::time).thenComparingInt(Event::value);

        int result = 0;
        int max = 0;
        for (int i = 0; i < events.size(); i++) {
            result += events.get(i).value;
            max = Math.max(result, max);
        }

        return max;
    }
}
