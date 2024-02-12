package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MajorityElementTest{
    private static MajorityElement test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MajorityElement();
    }

    @Test
    void TestCase1(){
        int[] nums = {3, 2, 3};
        assertEquals(test.majorityElement(nums), 3);
    }

    @Test
    void TestCase2(){
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        assertEquals(test.majorityElement(nums), 2);
    }

    @Test
    void TestCase3(){
        int[] nums = {3, 3, 4};
        assertEquals(test.majorityElement(nums), 3);
    }
}