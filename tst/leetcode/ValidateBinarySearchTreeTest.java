package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidateBinarySearchTreeTest{
    private static ValidateBinarySearchTree test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ValidateBinarySearchTree();
    }

    @Test
    void TestCase1(){
        Integer[] arr = {2, 1, 3};
        TreeNode root = Create.createTreeNodeTree(arr);
        assertEquals(test.isValidBST(root), true);
    }

    @Test
    void TestCase2(){
        Integer[] arr = {5, 1, 4, null, null, 3, 6};
        TreeNode root = Create.createTreeNodeTree(arr);
        assertEquals(test.isValidBST(root), false);
    }

    @Test
    void TestCase3(){
        Integer[] arr = {1, 1};
        TreeNode root = Create.createTreeNodeTree(arr);
        assertEquals(test.isValidBST(root), false);
    }
}