package medium.AddTwoNumbers;

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

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode node = new Solution().addTwoNumbers(l1, l2);

        System.out.println(node);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tmp = dummyHead;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val = 0;
            if (l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }

            val = val + carry;

            tmp.next = new ListNode(val%10);
            carry = val / 10;
            tmp = tmp.next;
        }

        return dummyHead.next;
    }

}