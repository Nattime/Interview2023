package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FinalArrayStateAfterKMultiplicationOperationsITest{
    private static FinalArrayStateAfterKMultiplicationOperationsI test;

    @BeforeAll
    static void beforeAll(){
        test = new FinalArrayStateAfterKMultiplicationOperationsI();
    }

    @Test
    @DisplayName("test_getFinalState_case1")
    void test_getFinalState_case1(){
        assertArrayEquals(new int[]{8, 4, 6, 5, 6}, test.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2));
    }

    @Test
    @DisplayName("test_getFinalState_case2")
    void test_getFinalState_case2(){
        assertArrayEquals(new int[]{16, 8}, test.getFinalState(new int[]{1, 2}, 3, 4));
    }
}