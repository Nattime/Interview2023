package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import resources.Create;
import resources.Print;
import resources.TreeNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeSumOfBSTTest{
    private static RangeSumOfBST test;

    @BeforeAll
    public static void setUp(){
        test = new RangeSumOfBST();
    }

    @Test
    void TestCase1(){
        Integer num[] = new Integer[]{10, 5, 15, 3, 7, null, 18};
        TreeNode root = Create.createTreeNodeTree(num);
        Print.printBinaryTree(root, false);
        assertEquals(test.rangeSumBST(root, 7, 15), 32);
    }

    @Test
    void TestCase2(){
        Integer num[] = new Integer[]{10, 5, 15, 3, 7, 13, 18, 1, null, 6};
        TreeNode root = Create.createTreeNodeTree(num);
        Print.printBinaryTree(root, false);
        assertEquals(test.rangeSumBST(root, 6, 10), 23);
    }

    @Test
    void TestCase3(){
    }
}