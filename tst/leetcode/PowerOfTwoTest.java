package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfTwoTest{
    private static PowerOfTwo test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new PowerOfTwo();
    }

    @Test
    void TestCase1(){
        assertEquals(test.isPowerOfTwo(1), true);
    }

    @Test
    void TestCase2(){
        assertEquals(test.isPowerOfTwo(16), true);
    }

    @Test
    void TestCase3(){
        assertEquals(test.isPowerOfTwo(3), false);
    }

    @Test
    void TestCase4(){
        assertEquals(test.isPowerOfTwo(0), false);
    }
}