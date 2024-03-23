package leetcode;

public class L143ReorderList {

    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) return;

        int size = 0;
        ListNode start = head;
        while (start != null) {
            size++;
            start = start.next;
        }

        ListNode[] nodes = new ListNode[size];
        start = head;
        for (int i = 0; i < size; i += 2) {
            nodes[i] = start;
            start = start.next;
        }
        int startIndex = (size % 2  == 0) ? size - 1 : size - 2;
        for (int i = startIndex; i > 0; i -= 2) {
            nodes[i] = start;
            start = start.next;
        }

        start = head;
        for (int i = 0; i < size; i++) {
            start.next = nodes[i];
            start = start.next;
        }
        start.next = null;
    }

    protected static class ListNode {

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
