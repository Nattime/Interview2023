package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatchingArrayTest{
    private static PatchingArray test;
    
    @BeforeAll
    static void beforeAll(){
        test = new PatchingArray();
    }
    
    @Test
    @DisplayName("test_minPatches_case1")
    void test_minPatches_case1(){
        assertEquals(test.minPatches(new int[]{1, 3}, 6), 1);
    }
    
    @Test
    @DisplayName("test_minPatches_case2")
    void test_minPatches_case2(){
        assertEquals(test.minPatches(new int[]{1, 5, 10}, 20), 2);
    }
    
    @Test
    @DisplayName("test_minPatches_case3")
    void test_minPatches_case3(){
        assertEquals(test.minPatches(new int[]{1, 2, 2}, 5), 0);
    }
}