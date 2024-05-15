package easy.remove.nth.node.from.end.of.list;


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

public class Main {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int level = goDeep(null, head, n);
        if (level-1 == n) {
            return head.next;
        }

        return head;
    }

    private int goDeep(ListNode prev, ListNode current, int n) {
        ListNode next = current.next;
        int level = 1;
        if (next != null) {
            level = goDeep(current, next, n);
            if (level-1 == n) {
                if (n == 1) {
                    current.next = null;
                } else {
                    current.next = current.next.next;
                }
            }
        }
        return ++level;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

//        ListNode listNode1 = new Main().removeNthFromEnd(head, 1);
//        ListNode listNode2 = new Main().removeNthFromEnd(head, 2);
        ListNode listNode4 = new Main().removeNthFromEnd(head, 4);
        System.out.println();
    }
}