package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KthSmallestPrimeFractionTest{
    private static KthSmallestPrimeFraction test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new KthSmallestPrimeFraction();
    }

    @Test
    void TestCase1(){
        assertArrayEquals(test.kthSmallestPrimeFraction(new int[]{1, 2, 3, 5}, 3), new int[]{2, 5});
    }

    @Test
    void TestCase2(){
        assertArrayEquals(test.kthSmallestPrimeFraction(new int[]{1, 7}, 1), new int[]{1, 7});
    }

    @Test
    void TestCase3(){
    }
}