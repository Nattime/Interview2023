package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToMakeArrayEmptyTest{
    private static MinimumNumberOfOperationsToMakeArrayEmpty test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumNumberOfOperationsToMakeArrayEmpty();
    }

    @Test
    void TestCase1(){
        int nums[] = new int[]{2, 3, 3, 2, 2, 4, 2, 3, 4};
        assertEquals(test.minOperations(nums), 4);
    }

    @Test
    void TestCase2(){
        int nums[] = new int[]{2, 1, 2, 2, 3, 3};
        assertEquals(test.minOperations(nums), -1);
    }

    @Test
    void TestCase3(){
        int nums[] = new int[]{3, 3, 3, 3, 3, 3};
        assertEquals(test.minOperations(nums), 2);
    }

    @Test
    void TestCase4(){
        int nums[] = new int[]{14, 12, 14, 14, 12, 14, 14, 12, 12, 12, 12, 14, 14, 12, 14, 14, 14, 12, 12};
        assertEquals(test.minOperations(nums), 7);
    }
}