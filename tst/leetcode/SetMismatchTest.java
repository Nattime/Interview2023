package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMismatchTest{
    private static SetMismatch test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new SetMismatch();
    }

    @Test
    void TestCase1(){
        int[] arr = {1, 2, 2, 4};
        assertArrayEquals(test.findErrorNums(arr), new int[]{2, 3});
    }

    @Test
    void TestCase2(){
        int[] arr = {1, 1};
        assertArrayEquals(test.findErrorNums(arr), new int[]{1, 2});
    }

    @Test
    void TestCase3(){
        int[] arr = {3, 2, 3, 4, 6, 5};
        assertArrayEquals(test.findErrorNums(arr), new int[]{3, 1});
    }
}