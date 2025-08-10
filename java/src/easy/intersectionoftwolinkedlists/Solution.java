package easy.intersectionoftwolinkedlists;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int x, ListNode node) {
        val = x;
        next = node;
    }
}


public class Solution {
    public static void main(String[] args) {
        ListNode common =  new ListNode(8, new ListNode(4, new ListNode(5)));
        ListNode listNode0 = new ListNode(4, new ListNode(1, common));
        ListNode listNode1 = new ListNode(5, new ListNode(6, new ListNode(1, common)));

//        ListNode listNode = new ListNode(2, new ListNode(6, new ListNode(4)));
//                          ListNode listNode1 = new ListNode(1, new ListNode(5));
        System.out.println(new Solution().getIntersectionNode(listNode0, listNode1));

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = getSize(headA, 0);
        int sizeB = getSize(headB, 0);

        while (sizeA != sizeB) {
            if (sizeA > sizeB) {
                headA = headA.next;
                sizeA--;
            } else {
                headB = headB.next;
                sizeB--;
            }
        }

       while (headA!=null){
           if (headA == headB){
               return headA;
           }
           headA = headA.next;
           headB = headB.next;
       }

       return null;
    }

    private int getSize(ListNode head, int size) {
        ListNode next = head.next;
        if (next != null) {
            return getSize(next, size + 1);
        }
        return size + 1;
    }
}