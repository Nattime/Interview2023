package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumIncrementToMakeArrayUniqueTest{
    private static MinimumIncrementToMakeArrayUnique test;
    
    @BeforeAll
    static void beforeAll(){
        test = new MinimumIncrementToMakeArrayUnique();
    }
    
    @Test
    @DisplayName("test_minIncrementForUnique_case1")
    void test_minIncrementForUnique_case1(){
        assertEquals(test.minIncrementForUnique(new int[]{1, 2, 2}), 1);
    }
    
    @Test
    @DisplayName("test_minIncrementForUnique_case2")
    void test_minIncrementForUnique_case2(){
        assertEquals(test.minIncrementForUnique(new int[]{3, 2, 1, 2, 1, 7}), 6);
    }
}