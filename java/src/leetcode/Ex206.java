package leetcode;

import hard.merge.k.sorted.lists.Main;

public class Ex206 {
    public static void main(String[] args) {
        Ex206 main = new Ex206();



    }

    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            head = prev;
        }

        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
