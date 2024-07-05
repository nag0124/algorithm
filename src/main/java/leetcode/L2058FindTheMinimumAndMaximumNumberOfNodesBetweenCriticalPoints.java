package leetcode;

public class L2058FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints {

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[2];
        ans[0] = Integer.MAX_VALUE;
        ListNode prev = head;
        ListNode cur = head.next;
        int prevIdx = 0;
        int idx = 1;
        int firstIdx = 0;

        while (cur.next != null) {
            if ((cur.val < prev.val && cur.val < cur.next.val) ||
                    (cur.val > prev.val && cur.val > cur.next.val)) {
                if (firstIdx == 0) {
                    firstIdx = idx;
                    prevIdx = idx;
                } else {
                    ans[0] = Math.min(ans[0], idx - prevIdx);
                    ans[1] = idx - firstIdx;
                    prevIdx = idx;
                }
            }
            prev = prev.next;
            cur = cur.next;
            idx++;
        }

        if (ans[0] == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        } else {
            return ans;
        }
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
