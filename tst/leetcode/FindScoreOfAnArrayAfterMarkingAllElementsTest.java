package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindScoreOfAnArrayAfterMarkingAllElementsTest{
    private static FindScoreOfAnArrayAfterMarkingAllElements test;

    @BeforeAll
    static void beforeAll(){
        test = new FindScoreOfAnArrayAfterMarkingAllElements();
    }

    @Test
    @DisplayName("test_findScore_case1")
    void test_findScore_case1(){
        assertEquals(7, test.findScore(new int[]{2, 1, 3, 4, 5, 2}));
    }

    @Test
    @DisplayName("test_findScore_case2")
    void test_findScore_case2(){
        assertEquals(5, test.findScore(new int[]{2, 3, 5, 1, 3, 2}));
    }
}