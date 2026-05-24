package leetcode;

import hard.merge.k.sorted.lists.Main;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 main = new Ex2();



    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(l1 != null || l2 != null || carry != 0){
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;

            int sum = v1 + v2 + carry;
            carry = sum/10;
            sum = sum%10;

            cur.next = new ListNode(sum);
            cur = cur.next;

            l1 = l1 == null? l1 : l1.next;
            l2 = l2 == null? l2 : l2.next;
        }

        return dummy.next;
    }

}
