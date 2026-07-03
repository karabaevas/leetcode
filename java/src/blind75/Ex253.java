package blind75;

import java.util.*;

/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
//public class Ex253 {
//    record Point(int dt, int change) {}
//
//    public int minMeetingRooms(List<Interval> intervals) {
//
//        int max = 0;
//        List<Point> points = new ArrayList<>();
//
//        for(Interval interval: intervals){
//            points.add(new Point(interval.start, 1));
//            points.add(new Point(interval.end, -1));
//        }
//
//        Collections.sort(points, Comparator.comparingInt(Point::dt).thenComparingInt(Point::change));
//
//        int res = 0;
//        for(Point point : points){
//            max = max + point.change();
//            res = Math.max(res, max);
//        }
//
//        return res;
//    }
//}
