package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.Test;

import static resources.AssertTest.assertIsEqual;

class MergeTwoBinaryTreesTest{
    private static MergeTwoBinaryTrees test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MergeTwoBinaryTrees();
    }

    @Test
    void TestCase1(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{2, 1, 3, null, 4, null, 7});
        TreeNode expected = Create.createTreeNodeTree(new Integer[]{3, 4, 5, 5, 4, null, 7});
        assertIsEqual(test.mergeTrees(root1, root2), expected);
    }

    @Test
    void TestCase2(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 2});
        TreeNode expected = Create.createTreeNodeTree(new Integer[]{2, 2});
        assertIsEqual(test.mergeTrees(root1, root2), expected);
    }

    @Test
    void TestCase3(){
    }
}