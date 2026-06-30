package blind75;

import java.util.HashMap;
import java.util.Map;

public class Ex23 {
//    public ListNode mergeKLists(ListNode[] lists) {
//        if(lists.length == 1){
//            return lists[0];
//        }
//
//        ListNode dummy = new ListNode(Integer.MIN_VALUE);
//        ListNode head = dummy;
//        for(ListNode list: lists){
//            head = mergeTwo(head, list);
//        }
//
//        return dummy.next;
//    }
//
//    ListNode  mergeTwo(ListNode list1, ListNode list2){
//        ListNode dummy = new ListNode(Integer.MIN_VALUE);
//        ListNode head = dummy;
//
//        while(list1 != null && list2 != null){
//            if(list1.val < list2.val){
//                head.next = list1;
//                list1 = list1.next;
//            } else {
//                head.next = list2;
//                list2 = list2.next;
//            }
//
//            head = head.next;
//        }
//
//        if(list1 != null){
//            head.next = list1;
//        }
//
//        if(list2 != null){
//            head.next = list2;
//        }
//
//        return dummy.next;
//    }
}
