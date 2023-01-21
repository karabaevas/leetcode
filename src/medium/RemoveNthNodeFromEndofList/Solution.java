package medium.RemoveNthNodeFromEndofList;

import java.util.*;


class ListNode {
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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int currLevelIndex = doDirt(cur, 1, n) + 1;
        if (currLevelIndex == n) {
            return head.next;
        }

        return head;
    }

    private Integer doDirt(ListNode parent, int currentNodeIndex, int n) {
        ListNode current = parent.next;
        if (current != null) {
            int nextLevelIndex = doDirt(current, ++currentNodeIndex, n);
            int curLevelIndex = nextLevelIndex + 1;
            if (curLevelIndex == n) {
                parent.next = current.next;
                current.next = null;
                return Integer.MIN_VALUE;
            } else {
                return curLevelIndex;
            }
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode x = new Solution().removeNthFromEnd(head, 2);
        System.out.println(x);
    }
}