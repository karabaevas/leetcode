package yandex.blind75;

public class Ex23 {
    public static void main(String[] args) {
        Ex23 main = new Ex23();


    }

    //
//    int counter = 1;
//    public Ex20.ListNode shittyremoveNthFromEnd(Ex20.ListNode head, int n) {
//        if(head == null || head.next == null){
//            counter++;
//            if(n==1){
//                return null;
//            }
//            return head;
//        }
//
//        Ex20.ListNode next = removeNthFromEnd(head.next, n);
//        if(counter == n){
//            counter++;
//            return next;
//        }
//        if(counter == n+1){
//            counter++;
//            head.next = next;
//            return head;
//        }
//
//        counter++;
//        return head;
//    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

// n+1
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}

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