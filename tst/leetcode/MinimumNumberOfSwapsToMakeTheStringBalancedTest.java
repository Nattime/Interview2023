package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfSwapsToMakeTheStringBalancedTest{
    private static MinimumNumberOfSwapsToMakeTheStringBalanced test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumNumberOfSwapsToMakeTheStringBalanced();
    }

    @Test
    @DisplayName("test_minSwaps_case1")
    void test_minSwaps_case1(){
        assertEquals(test.minSwaps("][]["), 1);
    }

    @Test
    @DisplayName("test_minSwaps_case2")
    void test_minSwaps_case2(){
        assertEquals(test.minSwaps("]]][[["), 2);
    }

    @Test
    @DisplayName("test_minSwaps_case3")
    void test_minSwaps_case3(){
        assertEquals(test.minSwaps("[]"), 0);
    }
}