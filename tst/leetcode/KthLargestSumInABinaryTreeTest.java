package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestSumInABinaryTreeTest{
    private static KthLargestSumInABinaryTree test;

    @BeforeAll
    static void beforeAll(){
        test = new KthLargestSumInABinaryTree();
    }

    @Test
    @DisplayName("test_kthLargestLevelSum_case1")
    void test_kthLargestLevelSum_case1(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{5, 8, 9, 2, 1, 3, 7, 4, 6});
        assertEquals(test.kthLargestLevelSum(root, 2), 13);
    }

    @Test
    @DisplayName("test_kthLargestLevelSum_case2")
    void test_kthLargestLevelSum_case2(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{1, 2, null, 3});
        assertEquals(test.kthLargestLevelSum(root, 1), 3);
    }
}