package resources;

import org.junit.jupiter.api.Test;

class AssertTestTest{
    private static AssertTest test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new AssertTest();
    }

    @Test
    void TestCase1_valid(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        AssertTest.assertIsEqual(root1, root2);
    }

    @Test
    void TestCase2_null(){
        TreeNode root1 = null;
        TreeNode root2 = null;
        AssertTest.assertIsEqual(root1, root2);
    }

    @Test
    void TestCase3_root1null(){
        TreeNode root1 = null;
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        AssertTest.assertIsEqual(root1, root2);
    }

    @Test
    void TestCase4_root2null(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        TreeNode root2 = null;
        AssertTest.assertIsEqual(root1, root2);
    }

    @Test
    void TestCase5_notequal(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5, 6});
        AssertTest.assertIsEqual(root1, root2);
    }

//    @Test
//    void TestCase1_valid(){
//        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
//        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
//        AssertTest.assertIsEqual(root1, root2);
//    }
//
//    @Test
//    void TestCase2_null(){
//        TreeNode root1 = null;
//        TreeNode root2 = null;
//        AssertTest.assertIsEqual(root1, root2);
//    }
//
//    @Test
//    void TestCase3_root1null(){
//        TreeNode root1 = null;
//        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
//        AssertTest.assertIsEqual(root1, root2);
//    }
//
//    @Test
//    void TestCase4_root2null(){
//        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
//        TreeNode root2 = null;
//        AssertTest.assertIsEqual(root1, root2);
//    }
//
//    @Test
//    void TestCase5_notequal(){
//        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5});
//        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, 5, 6});
//        AssertTest.assertIsEqual(root1, root2);
//    }
}