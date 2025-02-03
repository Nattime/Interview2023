package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStrictlyIncreasingOrStrictlyDecreasingSubarrayTest{
    private static LongestStrictlyIncreasingOrStrictlyDecreasingSubarray test;

    @BeforeAll
    static void beforeAll(){
        test = new LongestStrictlyIncreasingOrStrictlyDecreasingSubarray();
    }

    @Test
    @DisplayName("test_longestMonotonicSubarray_case1")
    void test_longestMonotonicSubarray_case1(){
        assertEquals(2, test.longestMonotonicSubarray(new int[]{1, 4, 3, 3, 2}));
    }

    @Test
    @DisplayName("test_longestMonotonicSubarray_case2")
    void test_longestMonotonicSubarray_case2(){
        assertEquals(1, test.longestMonotonicSubarray(new int[]{3, 3, 3, 3}));
    }

    @Test
    @DisplayName("test_longestMonotonicSubarray_case3")
    void test_longestMonotonicSubarray_case3(){
        assertEquals(3, test.longestMonotonicSubarray(new int[]{3, 2, 1}));
    }
}