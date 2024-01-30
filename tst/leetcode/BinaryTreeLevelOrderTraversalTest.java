package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeLevelOrderTraversalTest{
    private static BinaryTreeLevelOrderTraversal test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new BinaryTreeLevelOrderTraversal();
    }

    @Test
    void TestCase1(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        int[][] mat = {{3}, {9, 20}, {15, 7}};
        assertEquals(test.levelOrder(root), Create.createListList(mat));
    }

    @Test
    void TestCase2(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{1});
        int[][] mat = {{1}};
        assertEquals(test.levelOrder(root), Create.createListList(mat));
    }

    @Test
    void TestCase3(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{});
        int[][] mat = {};
        assertEquals(test.levelOrder(root), Create.createListList(mat));
    }
}