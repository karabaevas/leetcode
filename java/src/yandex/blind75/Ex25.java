package yandex.blind75;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Ex25 {
    public static void main(String[] args) {
        Ex25 main = new Ex25();



    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }

        PriorityQueue<Dto> pq = new PriorityQueue(Comparator.comparingInt(Dto::val).thenComparing(Dto::listIdx));
        for(int i=0; i<lists.length; i++){
            ListNode node = lists[i];
            if(node != null){
                pq.add(new Dto(lists[i].val, i));
            }
        }

        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while(!pq.isEmpty()){
            Dto dto = pq.poll();
            ListNode node = lists[dto.listIdx];
            head.next = node;
            head = head.next;

            if(node.next != null){
                pq.add(new Dto(node.next.val, dto.listIdx));
                lists[dto.listIdx] = node.next;
            }
        }
        return dummy.next;
    }

    record Dto(int val, int listIdx){}


}
