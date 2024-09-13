package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class XORQueriesOfASubarrayTest{
    private static XORQueriesOfASubarray test;

    @BeforeAll
    static void beforeAll(){
        test = new XORQueriesOfASubarray();
    }

    @Test
    @DisplayName("test_xorQueries_case1")
    void test_xorQueries_case1(){
        assertArrayEquals(test.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}}), new int[]{2, 7, 14, 8});
    }

    @Test
    @DisplayName("test_xorQueries_case2")
    void test_xorQueries_case2(){
        assertArrayEquals(test.xorQueries(new int[]{4, 8, 2, 10}, new int[][]{{2, 3}, {1, 3}, {0, 0}, {0, 3}}), new int[]{8, 0, 4, 4});
    }
}