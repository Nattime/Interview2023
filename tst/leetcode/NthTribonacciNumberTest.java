package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NthTribonacciNumberTest{
    private static NthTribonacciNumber test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new NthTribonacciNumber();
    }

    @Test
    void TestCase1(){
        assertEquals(test.tribonacci(4), 4);
    }

    @Test
    void TestCase2(){
        assertEquals(test.tribonacci(25), 1389537);
    }

    @Test
    void TestCase3(){
        assertEquals(test.tribonacci(0), 0);
    }

    @Test
    void TestCase4(){
        assertEquals(test.tribonacci(1), 1);
    }

    @Test
    void TestCase5(){
        assertEquals(test.tribonacci(2), 1);
    }
}