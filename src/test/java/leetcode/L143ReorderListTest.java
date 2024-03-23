package leetcode;

import org.junit.jupiter.api.Test;

class L143ReorderListTest {

    @Test
    void reorderList() {
        // given
        L143ReorderList solution = new L143ReorderList();
        L143ReorderList.ListNode node1 = new L143ReorderList.ListNode(1);
        L143ReorderList.ListNode node2 = new L143ReorderList.ListNode(2);
        L143ReorderList.ListNode node3 = new L143ReorderList.ListNode(3);
        L143ReorderList.ListNode node4 = new L143ReorderList.ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // when
        solution.reorderList(node1);
        
    }

}
