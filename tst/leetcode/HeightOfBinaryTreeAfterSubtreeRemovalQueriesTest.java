package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class HeightOfBinaryTreeAfterSubtreeRemovalQueriesTest{
    private static HeightOfBinaryTreeAfterSubtreeRemovalQueries test;

    @BeforeEach
    void before(){
        test = new HeightOfBinaryTreeAfterSubtreeRemovalQueries();
    }

    @Test
    @DisplayName("test_treeQueries_case1")
    void test_treeQueries_case1(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{1, 3, 4, 2, null, 6, 5, null, null, null, null, null, 7});
        assertArrayEquals(test.treeQueries(root, new int[]{4}), new int[]{2});
    }

    @Test
    @DisplayName("test_treeQueries_case2")
    void test_treeQueries_case2(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{5, 8, 9, 2, 1, 3, 7, 4, 6});
        assertArrayEquals(test.treeQueries(root, new int[]{3, 2, 4, 8}), new int[]{3, 2, 3, 2});
    }
}