package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestCombinationWithBitwiseANDGreaterThanZeroTest{
    private static LargestCombinationWithBitwiseANDGreaterThanZero test;

    @BeforeAll
    static void beforeAll(){
        test = new LargestCombinationWithBitwiseANDGreaterThanZero();
    }

    @Test
    @DisplayName("test_largestCombination_case1")
    void test_largestCombination_case1(){
        assertEquals(test.largestCombination(new int[]{16, 17, 71, 62, 12, 24, 14}), 4);
    }

    @Test
    @DisplayName("test_largestCombination_case2")
    void test_largestCombination_case2(){
        assertEquals(test.largestCombination(new int[]{8, 8}), 2);
    }
}