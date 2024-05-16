package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateBooleanBinaryTreeTest{
    private static EvaluateBooleanBinaryTree test;

    @BeforeAll
    static void beforeAll(){
        test = new EvaluateBooleanBinaryTree();
    }

    @Test
    void TestCase1(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{2, 1, 3, null, null, 0, 1});
        assertEquals(test.evaluateTree(root), true);
    }

    @Test
    void TestCase2(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{0});
        assertEquals(test.evaluateTree(root), false);
    }

    @Test
    void TestCase3(){
    }
}