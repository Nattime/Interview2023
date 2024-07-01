package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeConsecutiveOddsTest{
    private static ThreeConsecutiveOdds test;
    
    @BeforeAll
    static void beforeAll(){
        test = new ThreeConsecutiveOdds();
    }
    
    @Test
    @DisplayName("test_threeConsecutiveOdds_case1")
    void test_threeConsecutiveOdds_case1(){
        assertFalse(test.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
    }
    
    @Test
    @DisplayName("test_threeConsecutiveOdds_case2")
    void test_threeConsecutiveOdds_case2(){
        assertTrue(test.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }
}