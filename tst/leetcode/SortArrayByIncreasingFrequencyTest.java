package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayByIncreasingFrequencyTest{
    private static SortArrayByIncreasingFrequency test;

    @BeforeAll
    static void beforeAll(){
        test = new SortArrayByIncreasingFrequency();
    }

    @Test
    @DisplayName("test_frequencySort_case1")
    void test_frequencySort_case1(){
        assertArrayEquals(test.frequencySort(new int[]{1, 1, 2, 2, 2, 3}), new int[]{3, 1, 1, 2, 2, 2});
    }

    @Test
    @DisplayName("test_frequencySort_case2")
    void test_frequencySort_case2(){
        assertArrayEquals(test.frequencySort(new int[]{2, 3, 1, 3, 2}), new int[]{1, 3, 3, 2, 2});
    }

    @Test
    @DisplayName("test_frequencySort_case3")
    void test_frequencySort_case3(){
        assertArrayEquals(test.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}), new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1});
    }
}