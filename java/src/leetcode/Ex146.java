package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex146 {
    class LRUCache {

        class Node{
            Node prev;
            Node next;
            int key;
            int val;

            Node(Node prev, Node next, int key, int val){
                this.prev = prev;
                this.next = next;
                this.key = key;
                this.val = val;
            }
        }

        Map<Integer, Node> map;
        Node head = null;
        Node tail = null;
        int cap = 0;
        public LRUCache(int capacity) {
            map = new HashMap<>();
            head = new Node(null, null, 0, 0);
            tail = new Node(null, null, 0, 0);

            head.next = tail;
            tail.prev = head;

            cap = capacity;
        }

        public int get(int key) {
            Node oldNode = map.get(key);
            if(oldNode == null){
                return -1;
            }

            oldNode.prev.next = oldNode.next;
            oldNode.next.prev = oldNode.prev;

            // insert to head
            oldNode.prev = head;
            oldNode.next = head.next;
            head.next.prev = oldNode;
            head.next = oldNode;
            return oldNode.val;
        }

        public void put(int key, int value) {
            Node oldNode = map.get(key);
            if(oldNode == null){

                if(map.size() == cap){
                    Node lruNode = tail.prev;
                    lruNode.prev.next = lruNode.next;
                    lruNode.next.prev = lruNode.prev;
                    lruNode.next = null;
                    lruNode.prev = null;
                    map.remove(lruNode.key);
                }

                Node newNode = new Node(null, null, key, value);
                map.put(key, newNode);
                // insert to head
                newNode.prev = head;
                newNode.next = head.next;
                head.next.prev = newNode;
                head.next = newNode;
            } else {
                oldNode.prev.next = oldNode.next;
                oldNode.next.prev = oldNode.prev;

                // insert to head
                oldNode.prev = head;
                oldNode.next = head.next;
                head.next.prev = oldNode;
                head.next = oldNode;
                oldNode.val = value;
            }
        }
    }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

}
