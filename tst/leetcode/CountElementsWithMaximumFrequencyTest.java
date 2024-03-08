package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountElementsWithMaximumFrequencyTest{
    private static CountElementsWithMaximumFrequency test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new CountElementsWithMaximumFrequency();
    }

    @Test
    void TestCase1(){
        int[] input = {1, 2, 2, 3, 1, 4};
        assertEquals(test.maxFrequencyElements(input), 4);
    }

    @Test
    void TestCase2(){
        int[] input = {1, 2, 3, 4, 5};
        assertEquals(test.maxFrequencyElements(input), 5);
    }

    @Test
    void TestCase3(){
    }
}