package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestSightseeingPairTest{
    private static BestSightseeingPair test;

    @BeforeAll
    static void beforeAll(){
        test = new BestSightseeingPair();
    }

    @Test
    @DisplayName("test_maxScoreSightseeingPair_case1")
    void test_maxScoreSightseeingPair_case1(){
        assertEquals(11, test.maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
    }

    @Test
    @DisplayName("test_maxScoreSightseeingPair_case2")
    void test_maxScoreSightseeingPair_case2(){
        assertEquals(2, test.maxScoreSightseeingPair(new int[]{1, 2}));
    }
}