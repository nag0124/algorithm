package leetcode;

public class L2816DoubleANumberRepresentedAsALinkedList {

    public ListNode doubleIt(ListNode head) {
        int num = 0;
        ListNode prev = new ListNode(0, head);
        ListNode cur = head;
        ListNode root = prev;

        while (cur != null) {
            int dv = 2 * cur.val;
            prev.val += dv / 10;
            cur.val = dv % 10;

            prev = prev.next;
            cur = cur.next;
        }

        return (root.val == 0) ? root.next : root;
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
