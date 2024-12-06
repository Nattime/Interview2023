package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfIntegersToChooseFromARangeITest{
    private static MaximumNumberOfIntegersToChooseFromARangeI test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumNumberOfIntegersToChooseFromARangeI();
    }

    @Test
    @DisplayName("test_maxCount_case1")
    void test_maxCount_case1(){
        assertEquals(2, test.maxCount(new int[]{1, 6, 5}, 5, 6));
    }

    @Test
    @DisplayName("test_maxCount_case2")
    void test_maxCount_case2(){
        assertEquals(0, test.maxCount(new int[]{1, 2, 3, 4, 5, 6, 7}, 8, 1));
    }

    @Test
    @DisplayName("test_maxCount_case3")
    void test_maxCount_case3(){
        assertEquals(7, test.maxCount(new int[]{11}, 7, 50));
    }
}