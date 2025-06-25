package hard.merge.k.sorted.lists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    class Item {
        private int value;
        private int listIndex;

        Item(int value, int listIndex) {
            this.value = value;
            this.listIndex = listIndex;
        }

        public int getListIndex() {
            return this.listIndex;
        }

        public int getValue() {
            return this.value;
        }

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        if (lists.length == 1 && lists[0] == null) {
            return null;
        }

        PriorityQueue<Item> q = new PriorityQueue<>(Comparator.comparing(item -> item.value));
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.add(new Item(lists[i].val, i));
            }
        }

        int i = 0;
        ListNode result = null;
        ListNode prev = null;

        while (!q.isEmpty()) {
            Item minItem = q.poll();

            ListNode current = new ListNode(minItem.value);
            if (prev != null) {
                prev.next = current;
            }

            int listIndex = minItem.listIndex;
            ListNode listElementNext = lists[listIndex].next;
            if (listElementNext != null) {
                lists[listIndex] = listElementNext;
                q.add(new Item(listElementNext.val, listIndex));
            }

            if (i == 0) {
                result = current;
            }
            prev = current;
            i++;
        }

        return result;
    }
}
