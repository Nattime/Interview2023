package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryTreeInorderTraversalTest{
    private static BinaryTreeInorderTraversal test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new BinaryTreeInorderTraversal();
    }

    @Test
    void TestCase1(){
        Integer[] input = {1, null, 2, 3};
        TreeNode in = Create.createTreeNodeTree(input);
        List<Integer> output = List.of(new Integer[]{1, 3, 2});
        assertEquals(test.inorderTraversal(in), output);
    }

    @Test
    void TestCase2(){
        Integer[] input = {};
        TreeNode in = Create.createTreeNodeTree(input);
        List<Integer> output = List.of(new Integer[]{});
        assertEquals(test.inorderTraversal(in), output);
    }

    @Test
    void TestCase3(){
        Integer[] input = {1};
        TreeNode in = Create.createTreeNodeTree(input);
        List<Integer> output = List.of(new Integer[]{1});
        assertEquals(test.inorderTraversal(in), output);
    }
}