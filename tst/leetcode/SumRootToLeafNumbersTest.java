package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumRootToLeafNumbersTest{
    private static SumRootToLeafNumbers test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new SumRootToLeafNumbers();
    }

    @Test
    void TestCase1(){
        TreeNode treeNode = Create.createTreeNodeTree(new int[]{1, 2, 3});
        assertEquals(test.sumNumbers(treeNode), 25);
    }

    @Test
    void TestCase2(){
        TreeNode treeNode = Create.createTreeNodeTree(new int[]{4, 9, 0, 5, 1});
        assertEquals(test.sumNumbers(treeNode), 1026);
    }

    @Test
    void TestCase3(){
    }
}