//package hard.freqstack;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//public class Main {
//    class FreqStack {
//
//        private final LinkedList<Integer> storage;
//        private final Map<Integer, Integer> valToFreqMap;
//
//        public FreqStack() {
//            this.storage = new LinkedList<>();
//            this.valToFreqMap = new HashMap<>();
//        }
//
//        public void push(int val) {
//            storage.addFirst(val);
//            valToFreqMap.put(val, valToFreqMap.getOrDefault(val, 0) + 1);
//        }
//
//        public int pop() {
//
//        }
//    }
//
///**
// * Your FreqStack object will be instantiated and called as such:
// * FreqStack obj = new FreqStack();
// * obj.push(val);
// * int param_2 = obj.pop();
// */
//}