package easy.linked.list.cycle;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        if(head.next == null){
            return false;
        }

        ListNode fast = head.next;
        if (fast.val == slow.val && fast == slow ){
            return true;
        }

        return hasCycleInternal(slow, fast);
    }

    private boolean hasCycleInternal(ListNode slow, ListNode fast) {
        slow = slow.next;
        fast = fast.next == null? null : fast.next.next == null? null : fast.next.next;

        if (slow == null || fast == null){
            return false;
        } else {
            if (fast.val == slow.val && fast == slow ) {
                return true;
            } else {
                return hasCycleInternal(slow, fast);
            }
        }
    }

    public static void main(String[] args) {


//        System.out.println(new Solution().hasCycle());
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}


