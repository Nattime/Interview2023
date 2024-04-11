package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveKDigitsTest{
    private static RemoveKDigits test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new RemoveKDigits();
    }

    @Test
    void TestCase1(){
        assertEquals(test.removeKdigits("1432219", 3), "1219");
    }

    @Test
    void TestCase2(){
        assertEquals(test.removeKdigits("10200", 1), "200");
    }

    @Test
    void TestCase3(){
        assertEquals(test.removeKdigits("10", 2), "0");
    }

    @Test
    void TestCase4(){
        assertEquals(test.removeKdigits("10", 1), "0");
    }

    @Test
    void TestCase5(){
        assertEquals(test.removeKdigits("1234567890", 9), "0");
    }
}