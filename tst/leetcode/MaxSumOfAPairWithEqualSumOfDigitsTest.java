package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSumOfAPairWithEqualSumOfDigitsTest{
    private static MaxSumOfAPairWithEqualSumOfDigits test;

    @BeforeAll
    static void beforeAll(){
        test = new MaxSumOfAPairWithEqualSumOfDigits();
    }

    @Test
    @DisplayName("test_maximumSum_case1")
    void test_maximumSum_case1(){
        assertEquals(54, test.maximumSum(new int[]{18, 43, 36, 13, 7}));
    }

    @Test
    @DisplayName("test_maximumSum_case2")
    void test_maximumSum_case2(){
        assertEquals(-1, test.maximumSum(new int[]{10, 12, 19, 14}));
    }

    @Test
    @DisplayName("test_maximumSum_case3")
    void test_maximumSum_case3(){

    }
}