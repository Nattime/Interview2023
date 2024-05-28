package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetEqualSubstringsWithinBudgetTest{
    private static GetEqualSubstringsWithinBudget test;
    
    @BeforeAll
    static void beforeAll(){
        test = new GetEqualSubstringsWithinBudget();
    }
    
    @Test
    @DisplayName("test_equalSubstring_case1")
    void test_equalSubstring_case1(){
        assertEquals(test.equalSubstring("abcd", "bcdf", 3), 3);
    }
    
    @Test
    @DisplayName("test_equalSubstring_case2")
    void test_equalSubstring_case2(){
        assertEquals(test.equalSubstring("abcd", "cdef", 3), 1);
    }
    
    @Test
    @DisplayName("test_equalSubstring_case3")
    void test_equalSubstring_case3(){
        assertEquals(test.equalSubstring("abcd", "acde", 0), 1);
    }
    
    @Test
    @DisplayName("test_equalSubstring_case4")
    void test_equalSubstring_case4(){
        assertEquals(test.equalSubstring("abcd", "abcd", 0), 4);
    }
}