package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeightCheckerTest{
    private static HeightChecker test;
    
    @BeforeAll
    static void beforeAll(){
        test = new HeightChecker();
    }
    
    @Test
    @DisplayName("test_heightChecker_case1")
    void test_heightChecker_case1(){
        assertEquals(test.heightChecker(new int[]{1, 1, 4, 2, 1, 3}), 3);
    }
    
    @Test
    @DisplayName("test_heightChecker_case2")
    void test_heightChecker_case2(){
        assertEquals(test.heightChecker(new int[]{5, 1, 2, 3, 4}), 5);
    }
    
    @Test
    @DisplayName("test_heightChecker_case3")
    void test_heightChecker_case3(){
        assertEquals(test.heightChecker(new int[]{1, 2, 3, 4, 5}), 0);
    }
}