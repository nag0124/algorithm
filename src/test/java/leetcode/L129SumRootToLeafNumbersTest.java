package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L129SumRootToLeafNumbersTest {

    @Test
    void sumNumbers() {
        // given
        L129SumRootToLeafNumbers solution = new L129SumRootToLeafNumbers();
        L129SumRootToLeafNumbers.TreeNode n1 = new L129SumRootToLeafNumbers.TreeNode(5, null, null);
        L129SumRootToLeafNumbers.TreeNode n2 = new L129SumRootToLeafNumbers.TreeNode(1, null, null);
        L129SumRootToLeafNumbers.TreeNode n3 = new L129SumRootToLeafNumbers.TreeNode(9, n1, n2);
        L129SumRootToLeafNumbers.TreeNode n4 = new L129SumRootToLeafNumbers.TreeNode(0, null, null);
        L129SumRootToLeafNumbers.TreeNode n5 = new L129SumRootToLeafNumbers.TreeNode(4, n3, n4);

        // when
        int answer = solution.sumNumbers(n5);

        // then
        assertThat(answer).isEqualTo(1026);
    }

}
