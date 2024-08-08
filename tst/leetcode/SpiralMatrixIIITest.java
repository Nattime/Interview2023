package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SpiralMatrixIIITest{
    private static SpiralMatrixIII test;

    @BeforeAll
    static void beforeAll(){
        test = new SpiralMatrixIII();
    }

    @Test
    @DisplayName("test_spiralMatrixIII_case1")
    void test_spiralMatrixIii_case1(){
        int[][] arr = {{0, 0}, {0, 1}, {0, 2}, {0, 3}};
        assertArrayEquals(test.spiralMatrixIII(1, 4, 0, 0), arr);
    }

    @Test
    @DisplayName("test_spiralMatrixIii_case2")
    void test_spiralMatrixIii_case2(){
        int[][] arr = {{1, 4}, {1, 5}, {2, 5}, {2, 4}, {2, 3}, {1, 3}, {0, 3}, {0, 4}, {0, 5}, {3, 5}, {3, 4}, {3, 3}, {3, 2}, {2, 2}, {1, 2}, {0, 2}, {4, 5}, {4, 4}, {4, 3}, {4, 2}, {4, 1}, {3, 1}, {2, 1}, {1, 1}, {0, 1}, {4, 0}, {3, 0}, {2, 0}, {1, 0}, {0, 0}};
        assertArrayEquals(test.spiralMatrixIII(5, 6, 1, 4), arr);
    }
}