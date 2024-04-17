package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L988SmallestStringStartingFromLeafTest {

    @Test
    void smallestFromLeaf() {
        // given
        L988SmallestStringStartingFromLeaf solution = new L988SmallestStringStartingFromLeaf();
        L988SmallestStringStartingFromLeaf.TreeNode n1 = new L988SmallestStringStartingFromLeaf.TreeNode(0, null, null);
        L988SmallestStringStartingFromLeaf.TreeNode n2 = new L988SmallestStringStartingFromLeaf.TreeNode(1, n1, null);
        L988SmallestStringStartingFromLeaf.TreeNode n3 = new L988SmallestStringStartingFromLeaf.TreeNode(0, n2, null);
        L988SmallestStringStartingFromLeaf.TreeNode n4 = new L988SmallestStringStartingFromLeaf.TreeNode(0, null, null);
        L988SmallestStringStartingFromLeaf.TreeNode n5 = new L988SmallestStringStartingFromLeaf.TreeNode(1, n3, n4);
        L988SmallestStringStartingFromLeaf.TreeNode n6 = new L988SmallestStringStartingFromLeaf.TreeNode(25, n5, null);
//        L988SmallestStringStartingFromLEaf.TreeNode n7 = new L988SmallestStringStartingFromLEaf.TreeNode(0, n5, n6);

        // when
        String answer = solution.smallestFromLeaf(n6);

        // then
        assertThat(answer).isEqualTo("dba");
    }

}
