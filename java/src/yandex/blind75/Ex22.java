package yandex.blind75;

public class Ex22 {
    public static void main(String[] args) {
        Ex22 main = new Ex22();


    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while(list1 != null || list2 != null){
            if(list1 == null || (list2!=null && list1.val > list2.val)){
                result.next = list2;
                ListNode tmp = list2;
                list2 = list2.next;
                tmp.next = null;
                result = result.next;
            } else {
                result.next = list1;
                ListNode tmp = list1;
                list1 = list1.next;
                tmp.next = null;
                result = result.next;
            }
        }
        return head.next;
    }

    public class ListNode {
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

}
