package leetcode;

import java.util.Stack;

public class L234PalindromeLinkedList {

    protected class ListNode {

        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        curr = head;
        while (!stack.isEmpty() && curr.val == stack.pop().val) {
            curr = curr.next;
        }
        return curr == null;
    }


}


