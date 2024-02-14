package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RearrangeArrayElementsBySignTest{
    private static RearrangeArrayElementsBySign test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new RearrangeArrayElementsBySign();
    }

    @Test
    void TestCase1(){
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] ans = {3, -2, 1, -5, 2, -4};
        assertArrayEquals(test.rearrangeArray(nums), ans);
    }

    @Test
    void TestCase2(){
        int[] nums = {-1, 1};
        int[] ans = {1, -1};
        assertArrayEquals(test.rearrangeArray(nums), ans);
    }

    @Test
    void TestCase3(){
    }
}