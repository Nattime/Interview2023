package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumFallingPathSumIITest{
    private static MinimumFallingPathSumII test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinimumFallingPathSumII();
    }

    @Test
    void TestCase1(){
        assertEquals(test.minFallingPathSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}), 13);
    }

    @Test
    void TestCase2(){
        assertEquals(test.minFallingPathSum(new int[][]{{7}}), 7);
    }

    @Test
    void TestCase3(){
        assertEquals(test.minFallingPathSum(new int[][]{{-73, 61, 43, -48, -36}, {3, 30, 27, 57, 10}, {96, -76, 84, 59, -15}, {5, -49, 76, 31, -7}, {97, 91, 61, -46, 67}}), -192);
    }
}