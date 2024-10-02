package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RankTransformOfAnArrayTest{
    private static RankTransformOfAnArray test;

    @BeforeAll
    static void beforeAll(){
        test = new RankTransformOfAnArray();
    }

    @Test
    @DisplayName("test_arrayRankTransform_case1")
    void test_arrayRankTransform_case1(){
        assertArrayEquals(test.arrayRankTransform(new int[]{40, 10, 20, 30}), new int[]{4, 1, 2, 3});
    }

    @Test
    @DisplayName("test_arrayRankTransform_case2")
    void test_arrayRankTransform_case2(){
        assertArrayEquals(test.arrayRankTransform(new int[]{100, 100, 100}), new int[]{1, 1, 1});
    }

    @Test
    @DisplayName("test_arrayRankTransform_case3")
    void test_arrayRankTransform_case3(){
        assertArrayEquals(test.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}), new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3});
    }
}