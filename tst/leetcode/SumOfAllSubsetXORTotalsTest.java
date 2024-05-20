package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfAllSubsetXORTotalsTest{
    private static SumOfAllSubsetXORTotals test;
    
    @BeforeAll
    static void beforeAll(){
        test = new SumOfAllSubsetXORTotals();
    }
    
    @Test
    @DisplayName("test_subsetXORSum_case1")
    void test_subsetXorSum_case1(){
        int[] input = {1, 3};
        assertEquals(test.subsetXORSum(input), 6);
    }
    
    @Test
    @DisplayName("test_subsetXorSum_case2")
    void test_subsetXorSum_case2(){
        int[] input = {5, 1, 6};
        assertEquals(test.subsetXORSum(input), 28);
    }
    
    @Test
    @DisplayName("test_subsetXorSum_case3")
    void test_subsetXorSum_case3(){
        int[] input = {3, 4, 5, 6, 7, 8};
        assertEquals(test.subsetXORSum(input), 480);
    }
}