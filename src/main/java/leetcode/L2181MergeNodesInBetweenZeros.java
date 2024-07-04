package leetcode;

public class L2181MergeNodesInBetweenZeros {

    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        ListNode prev = null;

        while (head != null) {
            while (head.val != 0) {
                cur.val += head.val;
                head = head.next;
            }
            prev = cur;
            cur.next = new ListNode(0);
            cur = cur.next;
            head = head.next;
        }
        prev.next = null;
        return ans.next;
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
