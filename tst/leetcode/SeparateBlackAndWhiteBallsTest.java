package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SeparateBlackAndWhiteBallsTest{
    private static SeparateBlackAndWhiteBalls test;

    @BeforeAll
    static void beforeAll(){
        test = new SeparateBlackAndWhiteBalls();
    }

    @Test
    @DisplayName("test_minimumSteps_case1")
    void test_minimumSteps_case1(){
        assertEquals(test.minimumSteps("101"), 1);
    }

    @Test
    @DisplayName("test_minimumSteps_case2")
    void test_minimumSteps_case2(){
        assertEquals(test.minimumSteps("100"), 2);
    }

    @Test
    @DisplayName("test_minimumSteps_case3")
    void test_minimumSteps_case3(){
        assertEquals(test.minimumSteps("0111"), 0);
    }
}