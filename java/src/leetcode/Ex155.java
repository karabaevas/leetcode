package leetcode;

import java.util.LinkedList;

public class Ex155 {
    class MinStack {

        record Node(int cur, int min){};
        LinkedList<Node> nodes = new LinkedList<>();
        public MinStack() {

        }

        public void push(int val) {
            Node last = nodes.peekLast();
            if(last == null){
                nodes.addLast(new Node(val, val));
            } else {
                nodes.addLast(new Node(val, Math.min(val, last.min())));
            }
        }

        public void pop() {
            nodes.removeLast();
        }

        public int top() {
            return nodes.getLast().cur();
        }

        public int getMin() {
            return nodes.getLast().min();
        }
    }
}
