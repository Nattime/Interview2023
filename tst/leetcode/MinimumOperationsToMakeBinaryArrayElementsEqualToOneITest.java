package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToMakeBinaryArrayElementsEqualToOneITest{
    private static MinimumOperationsToMakeBinaryArrayElementsEqualToOneI test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
    }

    @Test
    @DisplayName("test_minOperations_case1")
    void test_minOperations_case1(){
        assertEquals(3, test.minOperations(new int[]{0, 1, 1, 1, 0, 0}));
    }

    @Test
    @DisplayName("test_minOperations_case2")
    void test_minOperations_case2(){
        assertEquals(-1, test.minOperations(new int[]{0, 1, 1, 1}));
    }

    @Test
    @DisplayName("test_minOperations_case3")
    void test_minOperations_case3(){
//        assertEquals(,test.minOperations(new int[]{}));
    }
}