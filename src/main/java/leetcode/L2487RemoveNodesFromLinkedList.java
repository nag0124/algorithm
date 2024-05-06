package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class L2487RemoveNodesFromLinkedList {

    public ListNode removeNodes(ListNode head) {
        int max = 0;
        ListNode pointer = head;

        while (pointer != null) {
            max = Math.max(max, pointer.val);
            pointer = pointer.next;
        }

        pointer = head;
        Deque<ListNode> que = new ArrayDeque<>();
        while (pointer != null) {
            if (que.isEmpty()) {
                if (pointer.val == max) que.add(pointer);
            } else {
                while (que.getLast().val < pointer.val) que.removeLast();
                que.add(pointer);
            }
            pointer = pointer.next;
        }

        pointer = new ListNode(0);
        for (ListNode l : que) {
            pointer.next = l;
            pointer = pointer.next;
        }
        return que.pollFirst();
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
