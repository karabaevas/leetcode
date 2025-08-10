package easy.middleOfTheLinkedList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println();
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }

        while(true){
            if (fast.next != null){
                fast = fast.next;
                slow = slow.next;
            } else {
                return slow;
            }
            if (fast.next != null){
                fast = fast.next;
            } else {
                return slow;
            }
        }
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
