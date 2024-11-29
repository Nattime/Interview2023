package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheNumberOfFairPairsTest{
    private static CountTheNumberOfFairPairs test;

    @BeforeAll
    static void beforeAll(){
        test = new CountTheNumberOfFairPairs();
    }

    @Test
    @DisplayName("test_countFairPairs_case1")
    void test_countFairPairs_case1(){
        assertEquals(6, test.countFairPairs(new int[]{0, 1, 7, 4, 4, 5}, 3, 6));
    }

    @Test
    @DisplayName("test_countFairPairs_case2")
    void test_countFairPairs_case2(){
        assertEquals(1, test.countFairPairs(new int[]{1, 7, 9, 2, 5}, 11, 11));
    }
}