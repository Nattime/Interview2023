package ukg;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapMaxSumTest{
    private static SwapMaxSum test;

    @BeforeAll
    static void beforeAll(){
        test = new SwapMaxSum();
    }

    @Test
    @DisplayName("test_getMaximumSum_case1")
    void test_getMaximumSum_case1(){
        List<Integer> input = Arrays.asList(2, 1, 4, 3);
        assertEquals(test.getMaximumSum(input), 30);
    }

    @Test
    @DisplayName("test_getMaximumSum_case2")
    void test_getMaximumSum_case2(){
        List<Integer> input = Arrays.asList(1, 9, 7, 3, 2);
        assertEquals(test.getMaximumSum(input), 66);
    }
}