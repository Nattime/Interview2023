package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeTwoArraysEqualByReversingSubarraysTest{
    private static MakeTwoArraysEqualByReversingSubarrays test;

    @BeforeAll
    static void beforeAll(){
        test = new MakeTwoArraysEqualByReversingSubarrays();
    }

    @Test
    @DisplayName("test_canBeEqual_case1")
    void test_canBeEqual_case1(){
        assertEquals(test.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3}), true);
    }

    @Test
    @DisplayName("test_canBeEqual_case2")
    void test_canBeEqual_case2(){
        assertEquals(test.canBeEqual(new int[]{7}, new int[]{7}), true);
    }

    @Test
    @DisplayName("test_canBeEqual_case3")
    void test_canBeEqual_case3(){
        assertEquals(test.canBeEqual(new int[]{3, 7, 9}, new int[]{3, 7, 11}), false);
    }
}