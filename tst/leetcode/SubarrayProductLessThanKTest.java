package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubarrayProductLessThanKTest{
    private static SubarrayProductLessThanK test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new SubarrayProductLessThanK();
    }

    @Test
    void TestCase1(){
        assertEquals(test.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100), 8);
    }

    @Test
    void TestCase2(){
        assertEquals(test.numSubarrayProductLessThanK(new int[]{1, 2, 3}, 0), 0);
    }

    @Test
    void TestCase3(){
    }
}