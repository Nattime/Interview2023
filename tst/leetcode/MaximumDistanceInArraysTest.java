package leetcode;

import com.resources.Create;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDistanceInArraysTest{
    private static MaximumDistanceInArrays test;

    @BeforeAll
    static void beforeAll(){
        test = new MaximumDistanceInArrays();
    }

    @Test
    @DisplayName("test_maxDistance_case1")
    void test_maxDistance_case1(){
        List<List<Integer>> input = Create.createListList(new int[][]{{1, 2, 3}, {4, 5}, {1, 2, 3}});
        assertEquals(test.maxDistance(input), 4);
    }

    @Test
    @DisplayName("test_maxDistance_case2")
    void test_maxDistance_case2(){
        List<List<Integer>> input = Create.createListList(new int[][]{{1}, {1}});
        assertEquals(test.maxDistance(input), 0);
    }

    @Test
    @DisplayName("test_maxDistance_case3")
    void test_maxDistance_case3(){
        List<List<Integer>> input = Create.createListList(new int[][]{{-1, 0, 1}, {-1, 1}, {1, 2}});
        assertEquals(test.maxDistance(input), 3);
    }
}