package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TheNumberOfTheSmallestUnoccupiedChairTest{
    private static TheNumberOfTheSmallestUnoccupiedChair test;

    @BeforeAll
    static void beforeAll(){
        test = new TheNumberOfTheSmallestUnoccupiedChair();
    }

    @Test
    @DisplayName("test_smallestChair_case1")
    void test_smallestChair_case1(){
        assertEquals(test.smallestChair(new int[][]{{1, 4}, {2, 3}, {4, 6}}, 1), 1);
    }

    @Test
    @DisplayName("test_smallestChair_case2")
    void test_smallestChair_case2(){
        assertEquals(test.smallestChair(new int[][]{{3, 10}, {1, 5}, {2, 6}}, 0), 2);
    }
}