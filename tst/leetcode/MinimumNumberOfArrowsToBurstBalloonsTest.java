package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfArrowsToBurstBalloonsTest{
    private static MinimumNumberOfArrowsToBurstBalloons test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinimumNumberOfArrowsToBurstBalloons();
    }

    @Test
    void TestCase1(){
        int[][] arr = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(test.findMinArrowShots(arr), 2);
    }

    @Test
    void TestCase2(){
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        assertEquals(test.findMinArrowShots(arr), 4);
    }

    @Test
    void TestCase3(){
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        assertEquals(test.findMinArrowShots(arr), 2);
    }

    @Test
    void TestCase4(){
        int[][] arr = {{-2147483646, -2147483645}, {2147483646, 2147483647}};
        assertEquals(test.findMinArrowShots(arr), 2);
    }
}