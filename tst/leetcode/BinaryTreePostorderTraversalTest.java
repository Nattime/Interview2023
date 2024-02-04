package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePostorderTraversalTest{
    private static BinaryTreePostorderTraversal test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new BinaryTreePostorderTraversal();
    }

    @Test
    void TestCase1(){
        Integer[] arr = {1, null, 2, 3};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[]{3, 2, 1}));
        assertEquals(test.postorderTraversal(root), result);
    }

    @Test
    void TestCase2(){
        Integer[] arr = {};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(List.of());
        assertEquals(test.postorderTraversal(root), result);
    }

    @Test
    void TestCase3(){
        Integer[] arr = {1};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[]{1}));
        assertEquals(test.postorderTraversal(root), result);
    }
}