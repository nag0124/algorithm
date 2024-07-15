package leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class L2196CreateBinaryTreeFromDescriptionsTest {

    @Test
    void createBinaryTree() {
        // given
        L2196CreateBinaryTreeFromDescriptions solution = new L2196CreateBinaryTreeFromDescriptions();
        int[][] descriptions = {{20,15,1},{20,17,0},{50,20,1},{50,80,0},{80,19,1}};

        // when
        solution.createBinaryTree(descriptions);

        // then
    }

}
