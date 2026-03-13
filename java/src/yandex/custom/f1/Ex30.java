package yandex.custom.f1;

import java.util.LinkedList;


public class Ex30 {
    public static void main(String[] args) {
        Ex30 main = new Ex30();

        MinStack minStack = new MinStack();

        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        minStack.top();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.push(2147483647);
        minStack.top();
        minStack.getMin();
        minStack.push(-2147483648);
        minStack.top();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

}

class MinStack {
    LinkedList<Node> list;
    int min;

    public MinStack() {
        list = new LinkedList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (!list.isEmpty()){
            min = Math.min(val, list.getLast().minVal);
        } else {
            min = Math.min(val, min);
        }
        list.addLast(new Node(val, min));
    }

    public void pop() {
        list.removeLast();
        if (list.size() == 0){
            min = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return list.getLast().val;
    }

    public int getMin() {
        return list.getLast().minVal;
    }

    record Node(int val, int minVal) {
    }
}
