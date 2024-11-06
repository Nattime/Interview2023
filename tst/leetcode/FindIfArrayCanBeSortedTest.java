package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIfArrayCanBeSortedTest{
    private static FindIfArrayCanBeSorted test;

    @BeforeAll
    static void beforeAll(){
        test = new FindIfArrayCanBeSorted();
    }

    @Test
    @DisplayName("test_canSortArray_case1")
    void test_canSortArray_case1(){
        assertTrue(test.canSortArray(new int[]{8, 4, 2, 30, 15}));
    }

    @Test
    @DisplayName("test_canSortArray_case2")
    void test_canSortArray_case2(){
        assertTrue(test.canSortArray(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    @DisplayName("test_canSortArray_case3")
    void test_canSortArray_case3(){
        assertFalse(test.canSortArray(new int[]{3, 16, 8, 4, 2}));
    }
}