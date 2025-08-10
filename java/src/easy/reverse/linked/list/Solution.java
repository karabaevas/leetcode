package easy.reverse.linked.list;

class Solution {
    static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


     private ListNode result = new ListNode();
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }

        reverseListInner(head);

        return result;
    }

    public ListNode reverseListInner(ListNode head) {
        if (head.next != null){
            ListNode updResult = reverseListInner(head.next);
            updResult.next = new ListNode(head.val);
            return updResult.next;
        } else {
            result = new ListNode(head.val);
            return result;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));

        ListNode result = new Solution().reverseList(head);
    }

}