package medium.reorderlist;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        ListNode nodes = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5 )))));
        main.reorderList(nodes);
//        ListNode reverse = main.reverse(nodes);
        System.out.println(nodes);
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (slow.next != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            } else {
                break;
            }
        }

        ListNode second = slow.next;
        slow.next = null;

        reverse(second);

        ListNode headCur = head;
        ListNode tailCur = reverseResult;
        while (tailCur != null){
            ListNode headNext = headCur.next;
            ListNode tailnext = tailCur.next;

            headCur.next = tailCur;
            if (tailnext == null){
                tailCur.next = headNext;
                break;
            }
            tailCur.next = headNext;


            headCur = headNext;
            tailCur = tailnext;
        }

    }

//    1 -> 2 -> 3 -> 3 - 2- - 1

    ListNode reverseResult = null;
    private ListNode reverse(ListNode head){
        if (head != null && head.next != null){
            ListNode reversed = reverse(head.next);
            reversed.next = new ListNode(head.val);

            return reversed.next;
        } else {
            reverseResult = new ListNode(head.val);
            return reverseResult;
        }
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

    @Override
    public String toString() {
        return "val=" + val;
    }
}