package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeastNumberOfUniqueIntegersAfterKRemovalsTest{
    private static LeastNumberOfUniqueIntegersAfterKRemovals test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new LeastNumberOfUniqueIntegersAfterKRemovals();
    }

    @Test
    void TestCase1(){
        int[] nums = {5, 5, 4};
        assertEquals(test.findLeastNumOfUniqueInts(nums, 1), 1);
    }

    @Test
    void TestCase2(){
        int[] nums = {4, 3, 1, 1, 3, 3, 2};
        assertEquals(test.findLeastNumOfUniqueInts(nums, 3), 2);
    }

    @Test
    void TestCase3(){
    }
}