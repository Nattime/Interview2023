package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSumOfDistinctSubarraysWithLengthKTest{
    private static MaximumSumOfDistinctSubarraysWithLengthK test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumSumOfDistinctSubarraysWithLengthK();
    }

    @Test
    @DisplayName("test_maximumSubarraySum_case1")
    void test_maximumSubarraySum_case1(){
        assertEquals(15, test.maximumSubarraySum(new int[]{1, 5, 4, 2, 9, 9, 9}, 3));
    }

    @Test
    @DisplayName("test_maximumSubarraySum_case2")
    void test_maximumSubarraySum_case2(){
        assertEquals(0, test.maximumSubarraySum(new int[]{4, 4, 4}, 3));
    }

    @Test
    @DisplayName("test_maximumSubarraySum_case3")
    void test_maximumSubarraySum_case3(){
        assertEquals(4, test.maximumSubarraySum(new int[]{1, 2, 1, 1, 3}, 2));
    }
}