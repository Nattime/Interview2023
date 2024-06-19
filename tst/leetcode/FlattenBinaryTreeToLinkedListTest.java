package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlattenBinaryTreeToLinkedListTest{
    private static FlattenBinaryTreeToLinkedList test;
    
    @BeforeAll
    static void beforeAll(){
        test = new FlattenBinaryTreeToLinkedList();
    }
    
    @Test
    @DisplayName("test_flatten_case1")
    void test_flatten_case1(){
        TreeNode root = Create.createTreeNodeTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        TreeNode output = Create.createTreeNodeTree(new Integer[]{1, null, 2, null, 3, null, 4, null, 5, null, 6});
        test.flatten(root);
        assertEquals(root, output);
    }
    
    @Test
    @DisplayName("test_flatten_case2")
    void test_flatten_case2(){
    
    }
    
    @Test
    @DisplayName("test_flatten_case3")
    void test_flatten_case3(){
    
    }
}