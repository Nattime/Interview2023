package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HouseRobberTest{
    private static HouseRobber test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new HouseRobber();
    }

    @Test
    void TestCase1(){
        int[] arr = {1, 2, 3, 1};
        assertEquals(test.rob(arr), 4);
    }

    @Test
    void TestCase2(){
        int[] arr = {2, 7, 9, 3, 1};
        assertEquals(test.rob(arr), 12);
    }

    @Test
    void TestCase3(){
        int[] arr = {2, 7, 3, 9, 1};
        assertEquals(test.rob(arr), 16);
    }

    @Test
    void TestCase4(){
        int[] arr = {1};
        assertEquals(test.rob(arr), 1);
    }

    @Test
    void TestCase5(){
        int[] arr = {2, 1, 1, 2};
        assertEquals(test.rob(arr), 4);
    }
}