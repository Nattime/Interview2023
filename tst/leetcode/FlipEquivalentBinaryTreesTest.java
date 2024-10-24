package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlipEquivalentBinaryTreesTest{
    private static FlipEquivalentBinaryTrees test;

    @BeforeAll
    static void beforeAll(){
        test = new FlipEquivalentBinaryTrees();
    }

    @Test
    @DisplayName("test_flipEquiv_case1")
    void test_flipEquiv_case1(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{1, 2, 3, 4, 5, 6, null, null, null, 7, 8});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7});
        assertEquals(test.flipEquiv(root1, root2), true);
    }

    @Test
    @DisplayName("test_flipEquiv_case2")
    void test_flipEquiv_case2(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{});
        assertEquals(test.flipEquiv(root1, root2), true);
    }

    @Test
    @DisplayName("test_flipEquiv_case3")
    void test_flipEquiv_case3(){
        TreeNode root1 = Create.createTreeNodeTree(new Integer[]{});
        TreeNode root2 = Create.createTreeNodeTree(new Integer[]{1});
        assertEquals(test.flipEquiv(root1, root2), false);
    }
}