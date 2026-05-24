package leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex281 {
    public class ZigzagIterator {
        LinkedList<Iterator<Integer>> q = new LinkedList<>();

        public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
            Iterator<Integer> it1 = v1.iterator();
            if(it1.hasNext()){
                q.addLast(it1);
            }

            Iterator<Integer> it2 = v2.iterator();
            if(it2.hasNext()){
                q.addLast(it2);
            }
        }


        public int next() {
            Iterator<Integer> it = q.getFirst();
            Integer next = it.next();

            q.removeFirst();
            if(it.hasNext()){
                q.addLast(it);
            }

            return next;
        }

        public boolean hasNext() {
            return !q.isEmpty();
        }
    }
}
