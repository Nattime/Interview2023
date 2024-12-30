package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountWaysToBuildGoodStringsTest{
    private static CountWaysToBuildGoodStrings test;

    @BeforeAll
    static void beforeAll(){
        test = new CountWaysToBuildGoodStrings();
    }

    @Test
    @DisplayName("test_countGoodStrings_case1")
    void test_countGoodStrings_case1(){
        assertEquals(8, test.countGoodStrings(3, 3, 1, 1));
    }

    @Test
    @DisplayName("test_countGoodStrings_case2")
    void test_countGoodStrings_case2(){
        assertEquals(5, test.countGoodStrings(2, 3, 1, 2));
    }
}