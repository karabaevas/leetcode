package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ex146 {
    class LRUCache {

        Node head = new Node( null, null, 0, 0);
        Node tail = new Node( null, null, 0, 0);
        int capacity;
        HashMap<Integer, Node> map = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.head.next = tail;
            this.tail.prev = head;
        }

        public int get(int key) {
            Node node = map.get(key);
            if(node == null){
                return -1;
            }

            removeFromMiddle(node);
            insertToHead(node);

            return node.value;
        }

        public void put(int key, int value) {
            Node oldNode = map.get(key);
            if(oldNode == null){
                Node newNode = new Node(null, null, key, value);
                insertToHead(newNode);
                map.put(key, newNode);
            } else {
                oldNode.value = value;

                removeFromMiddle(oldNode);
                insertToHead(oldNode);
            }

            if(map.size() > capacity){
                Node last = tail.prev;
                map.remove(last.key);
                removeFromMiddle(last);
            }
        }

        void removeFromMiddle(Node node){
            Node prev = node.prev;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        void insertToHead(Node node){
            node.next = head.next;
            head.next.prev = node;

            node.prev = head;
            head.next = node;
        }
    }
}


class Node{
    Node prev;
    Node next;
    int key;
    int value;
    Node(Node prev, Node next, int key, int value){
        this.prev = prev;
        this.next = next;
        this.key = key;
        this.value = value;
    }
}