package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreePreorderTraversalTest{
    private static BinaryTreePreorderTraversal test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new BinaryTreePreorderTraversal();
    }

    @Test
    void TestCase1(){
        Integer[] arr = {1, null, 2, 3};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3}));
        assertEquals(test.preorderTraversal(root), result);
    }

    @Test
    void TestCase2(){
        Integer[] arr = {};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(List.of());
        assertEquals(test.preorderTraversal(root), result);
    }

    @Test
    void TestCase3(){
        Integer[] arr = {1};
        TreeNode root = Create.createTreeNodeTree(arr);
        List<Integer> result = new ArrayList<>(List.of(1));
        assertEquals(test.preorderTraversal(root), result);
    }
}