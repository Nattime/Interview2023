package leetcode;

import com.resources.Create;
import com.resources.Print;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateBinaryTreeFromDescriptionsTest{
    private static CreateBinaryTreeFromDescriptions test;
    
    @BeforeAll
    static void beforeAll(){
        test = new CreateBinaryTreeFromDescriptions();
    }
    
    @Test
    @DisplayName("test_createBinaryTree_case1")
    void test_createBinaryTree_case1(){
        TreeNode output = Create.createTreeNodeTree(new Integer[]{50, 20, 80, 15, 17, 19});
        TreeNode input = test.createBinaryTree(new int[][]{{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}, {80, 19, 1}});
        Print.printBinaryTree(input);
        Print.printBinaryTree(output);
        assertEquals(input, output);
    }
    
    @Test
    @DisplayName("test_createBinaryTree_case2")
    void test_createBinaryTree_case2(){
        TreeNode output = Create.createTreeNodeTree(new Integer[]{1, 2, null, null, 3, 4});
        TreeNode input = test.createBinaryTree(new int[][]{{1, 2, 1}, {2, 3, 0}, {3, 4, 1}});
        Print.printBinaryTree(input);
        Print.printBinaryTree(output);
        assertEquals(input, output);
    }
    
    @Test
    @DisplayName("test_createBinaryTree_case3")
    void test_createBinaryTree_case3(){
        TreeNode output = Create.createTreeNodeTree(new Integer[]{74, 85, 39, 82, null, 13, 70, 38});
        TreeNode input = test.createBinaryTree(new int[][]{{85, 82, 1}, {74, 85, 1}, {39, 70, 0}, {82, 38, 1}, {74, 39, 0}, {39, 13, 1}});
        Print.printBinaryTree(input);
        Print.printBinaryTree(output);
        assertEquals(input, output);
    }
}