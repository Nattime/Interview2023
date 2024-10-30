package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RelativeSortArrayTest{
    private static RelativeSortArray test;

    @BeforeAll
    static void beforeAll(){
        test = new RelativeSortArray();
    }

    @Test
    @DisplayName("test_relativeSortArray_case1")
    void test_relativeSortArray_case1(){
        assertArrayEquals(test.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6}), new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19});
    }

    @Test
    @DisplayName("test_relativeSortArray_case2")
    void test_relativeSortArray_case2(){
        assertArrayEquals(test.relativeSortArray(new int[]{28, 6, 22, 8, 44, 17}, new int[]{22, 28, 8, 6}), new int[]{22, 28, 8, 6, 17, 44});
    }
}