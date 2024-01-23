package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest{
    private static MaximumDepthOfBinaryTree test;

    @BeforeAll
    static void setup(){
        test = new MaximumDepthOfBinaryTree();
    }

    @Test
    void TestCase1(){
        Integer[] arg = {3, 9, 20, null, null, 15, 7};
        TreeNode root = Create.createTreeNodeTree(arg);
        assertEquals(test.maxDepth(root), 3);
    }

    @Test
    void TestCase2(){
        Integer[] arg = {1, null, 2};
        TreeNode root = Create.createTreeNodeTree(arg);
        assertEquals(test.maxDepth(root), 2);
    }

    @Test
    void TestCase3(){
    }
}