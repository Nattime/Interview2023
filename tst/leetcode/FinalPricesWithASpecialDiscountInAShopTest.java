package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FinalPricesWithASpecialDiscountInAShopTest{
    private static FinalPricesWithASpecialDiscountInAShop test;

    @BeforeAll
    static void beforeAll(){
        test = new FinalPricesWithASpecialDiscountInAShop();
    }

    @Test
    @DisplayName("test_finalPrices_case1")
    void test_finalPrices_case1(){
        assertArrayEquals(new int[]{4, 2, 4, 2, 3}, test.finalPrices(new int[]{8, 4, 6, 2, 3}));
    }

    @Test
    @DisplayName("test_finalPrices_case2")
    void test_finalPrices_case2(){
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, test.finalPrices(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("test_finalPrices_case3")
    void test_finalPrices_case3(){
        assertArrayEquals(new int[]{9, 0, 1, 6}, test.finalPrices(new int[]{10, 1, 1, 6}));
    }
}