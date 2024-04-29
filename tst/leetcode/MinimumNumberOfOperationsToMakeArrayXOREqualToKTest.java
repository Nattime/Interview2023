package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToMakeArrayXOREqualToKTest{
    private static MinimumNumberOfOperationsToMakeArrayXOREqualToK test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinimumNumberOfOperationsToMakeArrayXOREqualToK();
    }

    @Test
    void TestCase1(){
        assertEquals(test.minOperations(new int[]{2, 1, 3, 4}, 1), 2);
    }

    @Test
    void TestCase2(){
        assertEquals(test.minOperations(new int[]{2, 0, 2, 0}, 0), 0);
    }

    @Test
    void TestCase3(){
    }
}