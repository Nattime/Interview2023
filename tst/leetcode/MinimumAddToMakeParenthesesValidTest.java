package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAddToMakeParenthesesValidTest{
    private static MinimumAddToMakeParenthesesValid test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumAddToMakeParenthesesValid();
    }

    @Test
    @DisplayName("test_minAddToMakeValid_case1")
    void test_minAddToMakeValid_case1(){
        assertEquals(test.minAddToMakeValid("())"), 1);
    }

    @Test
    @DisplayName("test_minAddToMakeValid_case2")
    void test_minAddToMakeValid_case2(){
        assertEquals(test.minAddToMakeValid("((("), 3);
    }

    @Test
    @DisplayName("test_minAddToMakeValid_case3")
    void test_minAddToMakeValid_case3(){
        assertEquals(test.minAddToMakeValid("()))(("), 4);
    }
}