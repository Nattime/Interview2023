package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortTheJumbledNumbersTest{
    private static SortTheJumbledNumbers test;
    
    @BeforeAll
    static void beforeAll(){
        test = new SortTheJumbledNumbers();
    }
    
    @Test
    @DisplayName("test_sortJumbled_case1")
    void test_sortJumbled_case1(){
        assertArrayEquals(test.sortJumbled(new int[]{8, 9, 4, 0, 2, 1, 3, 5, 7, 6}, new int[]{991, 338, 38}), new int[]{338, 38, 991});
    }
    
    @Test
    @DisplayName("test_sortJumbled_case2")
    void test_sortJumbled_case2(){
        assertArrayEquals(test.sortJumbled(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{789, 456, 123}), new int[]{123, 456, 789});
    }
    
    @Test
    @DisplayName("test_sortedJumbled_case3")
    void test_sortedJumbled_case3(){
        assertArrayEquals(test.sortJumbled(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}), new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
    }
    
    @Test
    @DisplayName("test_sortedJumbled_case4")
    void test_sortedJumbled_case4(){
        assertArrayEquals(test.sortJumbled(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, new int[]{9, 99, 999, 9999, 999999999}), new int[]{9, 99, 999, 9999, 999999999});
    }
}