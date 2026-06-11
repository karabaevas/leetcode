package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Ex895 {
    class FreqStack {

        Map<Integer, Stack<Integer>> freqStack;
        Map<Integer, Integer> valFreq;
        int maxFreq = 0;


        public FreqStack() {
            freqStack = new HashMap<>();
            valFreq = new HashMap<>();
        }

        public void push(int val) {
            int freq = valFreq.getOrDefault(val, 0)+1;
            valFreq.put(val, freq);

            Stack<Integer> stack = freqStack.getOrDefault(freq, new Stack<Integer>());
            stack.push(val);
            freqStack.put(freq, stack);
            maxFreq = Math.max(maxFreq, freq);
        }

        public int pop() {
            Stack<Integer> stack = freqStack.get(maxFreq);
            int val = stack.pop();
            if(stack.isEmpty()){
                freqStack.remove(maxFreq);
                maxFreq--;
            }
            valFreq.put(val, valFreq.get(val)-1);

            return val;
        }
    }

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */

}
