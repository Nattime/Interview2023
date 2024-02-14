package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectSquaresTest{
    private static PerfectSquares test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new PerfectSquares();
    }

    @Test
    void TestCase1(){
        assertEquals(test.numSquares(12), 3);
    }

    @Test
    void TestCase2(){
        assertEquals(test.numSquares(13), 2);
    }

    @Test
    void TestCase3(){
//        assertEquals(test.numSquares(12), 3);
    }
}