package leetcode;

import com.resources.Create;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SmallestRangeCoveringElementsFromKListsTest{
    private static SmallestRangeCoveringElementsFromKLists test;

    @BeforeAll
    static void beforeAll(){
        test = new SmallestRangeCoveringElementsFromKLists();
    }

    @Test
    @DisplayName("test_smallestRange_case1")
    void test_smallestRange_case1(){
        List<List<Integer>> lists = Create.createListList(new int[][]{{4, 10, 15, 24, 26}, {0, 9, 12, 20}, {5, 18, 22, 30}});
        assertArrayEquals(test.smallestRange(lists), new int[]{20, 24});
    }

    @Test
    @DisplayName("test_smallestRange_case2")
    void test_smallestRange_case2(){
        List<List<Integer>> lists = Create.createListList(new int[][]{{1, 2, 3}, {1, 2, 3}, {1, 2, 3}});
        assertArrayEquals(test.smallestRange(lists), new int[]{1, 1});
    }
}