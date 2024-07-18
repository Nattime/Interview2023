package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfGoodLeafNodesPairsTest{
    private static NumberOfGoodLeafNodesPairs test;
    
    @BeforeAll
    static void beforeAll(){
        test = new NumberOfGoodLeafNodesPairs();
    }
    
    @Test
    @DisplayName("test_countPairs_case1")
    void test_countPairs_case1(){
        TreeNode input = Create.createTreeNodeTree(new Integer[]{1, 2, 3, null, 4});
        assertEquals(test.countPairs(input, 3), 1);
    }
    
    @Test
    @DisplayName("test_countPairs_case2")
    void test_countPairs_case2(){
        TreeNode input = Create.createTreeNodeTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(test.countPairs(input, 3), 2);
    }
    
    @Test
    @DisplayName("test_countPairs_case3")
    void test_countPairs_case3(){
        TreeNode input = Create.createTreeNodeTree(new Integer[]{7, 1, 4, 6, null, 5, 3, null, null, null, null, null, 2});
        assertEquals(test.countPairs(input, 3), 1);
    }
}