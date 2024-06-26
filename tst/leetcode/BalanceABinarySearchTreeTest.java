package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BalanceABinarySearchTreeTest{
    private static BalanceABinarySearchTree test;
    
    @BeforeAll
    static void beforeAll(){
        test = new BalanceABinarySearchTree();
    }
    
    @Test
    @DisplayName("test_balanceBST_case1")
    void test_balanceBst_case1(){
        TreeNode input = Create.createTreeNodeTree(new Integer[]{1, null, 2, null, 3, null, 4, null, null});
        TreeNode output = Create.createTreeNodeTree(new Integer[]{2, 1, 3, null, null, null, 4});
        TreeNode root = test.balanceBST(input);
        assertEquals(root, output);
    }
    
    @Test
    @DisplayName("test_balanceBst_case2")
    void test_balanceBst_case2(){
        TreeNode input = Create.createTreeNodeTree(new Integer[]{2, 1, 3});
        TreeNode output = Create.createTreeNodeTree(new Integer[]{2, 1, 3});
        TreeNode root = test.balanceBST(input);
        assertEquals(root, output);
    }
}