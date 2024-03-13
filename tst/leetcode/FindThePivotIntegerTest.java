package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindThePivotIntegerTest{
    private static FindThePivotInteger test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new FindThePivotInteger();
    }

    @Test
    void TestCase1(){
        assertEquals(test.pivotInteger(8), 6);
    }

    @Test
    void TestCase2(){
        assertEquals(test.pivotInteger(1), 1);
    }

    @Test
    void TestCase3(){
        assertEquals(test.pivotInteger(4), -1);
    }
}