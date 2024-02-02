package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest{
    private static LongestConsecutiveSequence test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new LongestConsecutiveSequence();
    }

    @Test
    void TestCase1(){
        int[] nums = {100, 4, 200, 1, 3, 2};
        assertEquals(test.longestConsecutive(nums), 4);
    }

    @Test
    void TestCase2(){
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        assertEquals(test.longestConsecutive(nums), 9);
    }

    @Test
    void TestCase3(){
        int[] nums = {-7, -1, 3, -9, -4, 7, -3, 2, 4, 9, 4, -9, 8, -7, 5, -1, -7};
        assertEquals(test.longestConsecutive(nums), 4);
    }
}