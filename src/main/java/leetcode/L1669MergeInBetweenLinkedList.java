package leetcode;

public class L1669MergeInBetweenLinkedList {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode();
        dummy.next = list1;
        ListNode l1Left = dummy;
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                l1Left = l1Left.next;
            }
        }
        ListNode l1Right = l1Left;
        for (int i = 0; i < b - a + 2; i++) {
            l1Right = l1Right.next;
        }

        ListNode l2Tail = list2;
        while (l2Tail.next != null) l2Tail = l2Tail.next;

        l1Left.next = list2;
        l2Tail.next = l1Right;

        return dummy.next;
    }

    private class ListNode {

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
