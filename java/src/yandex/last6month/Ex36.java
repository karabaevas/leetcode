package yandex.last6month;

import java.util.*;

class LRUCache {
    public static void main(String[] args) {
//        LRUCache main = new LRUCache();
    }


    class Node {
        int value;
        int key;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> map;
    int limit;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
        limit = capacity;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        Node node = map.get(key);
        removeNode(node);
        insertToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node newNode = new Node(key, value);
        Node oldNode = map.get(key);

        if (oldNode == null) {
            insertToHead(newNode);

        } else {
            removeNode(oldNode);
            insertToHead(newNode);
        }
        map.put(key, newNode);

        if (map.size() > limit) {
            Node last = tail.prev;
            removeNode(last);
            map.remove(last.key);
        }
    }

    private void insertToHead(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    private void removeNode(Node node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}
