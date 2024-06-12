package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortColorsTest{
    private static SortColors test;
    
    @BeforeAll
    static void beforeAll(){
        test = new SortColors();
    }
    
    @Test
    @DisplayName("test_sortColors_case1")
    void test_sortColors_case1(){
        int[] input = new int[]{2, 0, 2, 1, 1, 0};
        int[] output = new int[]{0, 0, 1, 1, 2, 2};
        test.sortColors(input);
        assertArrayEquals(input, output);
    }
    
    @Test
    @DisplayName("test_sortColors_case2")
    void test_sortColors_case2(){
        int[] input = new int[]{2, 0, 1};
        int[] output = new int[]{0, 1, 2};
        test.sortColors(input);
        assertArrayEquals(input, output);
    }
}