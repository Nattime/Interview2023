package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest{
    private static ClimbingStairs test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ClimbingStairs();
    }

    @Test
    void TestCase1(){
        int n = 2;
        assertEquals(test.climbStairs(n), 2);
    }

    @Test
    void TestCase2(){
        int n = 3;
        assertEquals(test.climbStairs(n), 3);
    }

    @Test
    void TestCase3(){
    }
}