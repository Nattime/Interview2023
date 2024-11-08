package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaximumXORForEachQueryTest{
    private static MaximumXORForEachQuery test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumXORForEachQuery();
    }

    @Test
    @DisplayName("test_getMaximumXor_case1")
    void test_getMaximumXor_case1(){
        assertArrayEquals(test.getMaximumXor(new int[]{0, 1, 1, 3}, 2), new int[]{0, 3, 2, 3});
    }

    @Test
    @DisplayName("test_getMaximumXor_case2")
    void test_getMaximumXor_case2(){
        assertArrayEquals(test.getMaximumXor(new int[]{2, 3, 4, 7}, 3), new int[]{5, 2, 6, 5});
    }

    @Test
    @DisplayName("test_getMaximumXor_case3")
    void test_getMaximumXor_case3(){
        assertArrayEquals(test.getMaximumXor(new int[]{0, 1, 2, 2, 5, 7}, 3), new int[]{4, 3, 6, 4, 6, 7});
    }
}