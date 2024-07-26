package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistanceTest{
    private static FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance test;
    
    @BeforeAll
    static void beforeAll(){
        test = new FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance();
    }
    
    @Test
    @DisplayName("test_findTheCity_case1")
    void test_findTheCity_case1(){
        assertEquals(test.findTheCity(4, new int[][]{{0, 1, 3}, {1, 2, 1}, {1, 3, 4}, {2, 3, 1}}, 4), 3);
    }
    
    @Test
    @DisplayName("test_findTheCity_case2")
    void test_findTheCity_case2(){
        assertEquals(test.findTheCity(5, new int[][]{{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}}, 2), 0);
    }
}