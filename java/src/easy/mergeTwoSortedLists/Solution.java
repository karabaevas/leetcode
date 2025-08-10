package easy.mergeTwoSortedLists;

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

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }

        ListNode dummy = new ListNode();
        ListNode head = new ListNode();
        dummy.next = head;
        while (list1 != null || list2 != null) {
            ListNode curr = new ListNode();
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    curr.val = list1.val;
                    list1 = list1.next;
                } else {
                    curr.val = list2.val;
                    list2 = list2.next;
                }
            } else {
                if (list1 != null) {
                    curr.val = list1.val;
                    list1 = list1.next;
                } else {
                    curr.val = list2.val;
                    list2 = list2.next;
                }
            }

            head.val = curr.val;

            if (list1 != null || list2 != null) {
                head.next = new ListNode();
                head = head.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(3));
        ListNode listNode1 = new ListNode(2, new ListNode(7));
//        System.out.println(new Solution().mergeTwoLists(listNode, listNode1));
        System.out.println(new Solution().mergeTwoLists(null, null));
    }
}