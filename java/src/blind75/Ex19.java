package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex19 {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//
//        ListNode slow = head;
//        ListNode fast = head;
//
//        for(int i = 0; i<n; i++){
//            fast = fast.next;
//        }
//
//        while(fast != null && fast.next != null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        if(fast != null){
//            ListNode deleted = slow.next;
//            slow.next = slow.next.next;
//            deleted.next = null;
//        } else {
//            head = slow.next;
//            ListNode deleted = slow;
//            deleted.next = null;
//            return head;
//        }
//
//
//        return head;
//    }
}
