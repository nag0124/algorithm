package leetcode;

import org.junit.jupiter.api.Test;

class L1325DeleteLeavesWithAGivenValueTest {

    @Test
    void removeLeafNodes() {
        // given
        L1325DeleteLeavesWithAGivenValue.TreeNode n1 = new L1325DeleteLeavesWithAGivenValue.TreeNode(4);
        L1325DeleteLeavesWithAGivenValue.TreeNode n2 = new L1325DeleteLeavesWithAGivenValue.TreeNode(2);
        L1325DeleteLeavesWithAGivenValue.TreeNode n3 = new L1325DeleteLeavesWithAGivenValue.TreeNode(2);
        L1325DeleteLeavesWithAGivenValue.TreeNode n4 = new L1325DeleteLeavesWithAGivenValue.TreeNode(3, n2, n1);
        L1325DeleteLeavesWithAGivenValue.TreeNode n5 = new L1325DeleteLeavesWithAGivenValue.TreeNode(2, n3, null);
        L1325DeleteLeavesWithAGivenValue.TreeNode n6 = new L1325DeleteLeavesWithAGivenValue.TreeNode(1, n5, n4);
        L1325DeleteLeavesWithAGivenValue solution = new L1325DeleteLeavesWithAGivenValue();

        // when
        solution.removeLeafNodes(n6, 2);

        // then
    }

}
