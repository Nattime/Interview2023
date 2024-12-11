package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumBeautyOfAnArrayAfterApplyingOperationTest{
    private static MaximumBeautyOfAnArrayAfterApplyingOperation test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumBeautyOfAnArrayAfterApplyingOperation();
    }

    @Test
    @DisplayName("test_maximumBeauty_case1")
    void test_maximumBeauty_case1(){
        assertEquals(3, test.maximumBeauty(new int[]{4, 6, 1, 2}, 2));
    }

    @Test
    @DisplayName("test_maximumBeauty_case2")
    void test_maximumBeauty_case2(){
        assertEquals(4, test.maximumBeauty(new int[]{1, 1, 1, 1}, 10));
    }

    @Test
    @DisplayName("test_maximumBeauty_case3")
    void test_maximumBeauty_case3(){
        assertEquals(1, test.maximumBeauty(new int[]{100000}, 0));
    }
}