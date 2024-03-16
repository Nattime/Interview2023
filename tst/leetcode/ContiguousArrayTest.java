package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContiguousArrayTest{
    private static ContiguousArray test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ContiguousArray();
    }

    @Test
    void TestCase1(){
        int[] arr = {0, 1};
        assertEquals(test.findMaxLength(arr), 2);
    }

    @Test
    void TestCase2(){
        int[] arr = {0, 1, 0};
        assertEquals(test.findMaxLength(arr), 2);
    }

    @Test
    void TestCase3(){
    }
}