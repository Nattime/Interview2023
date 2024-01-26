package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest{
    private static ReverseInteger test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ReverseInteger();
    }

    @Test
    void TestCase1(){
        assertEquals(test.reverse(123), 321);
    }

    @Test
    void TestCase2(){
        assertEquals(test.reverse(-123), -321);
    }

    @Test
    void TestCase3(){
        assertEquals(test.reverse(120), 21);
    }

    @Test
    void TestCase4(){
        assertEquals(test.reverse(1_534_236_469), 0);
    }

    @Test
    void TestCase5(){
        assertEquals(test.reverse(-2147483647), 0);
    }
}