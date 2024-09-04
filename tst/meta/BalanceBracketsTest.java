package meta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceBracketsTest{
    private static BalanceBrackets test;

    @BeforeAll
    static void beforeAll(){
        test = new BalanceBrackets();
    }

    @Test
    @DisplayName("test_isBalanced_case1")
    void test_isBalanced_case1(){
        assertTrue(test.isBalanced("{[()]}"));
    }

    @Test
    @DisplayName("test_isBalanced_case2")
    void test_isBalanced_case2(){
        assertTrue(test.isBalanced("{}()"));
    }

    @Test
    @DisplayName("test_isBalanced_case3")
    void test_isBalanced_case3(){
        assertFalse(test.isBalanced("{(})"));
    }

    @Test
    @DisplayName("test_isBalanced_case4")
    void test_isBalanced_case4(){
        assertFalse(test.isBalanced(")"));
    }

    @Test
    @DisplayName("test_isBalanced_case5")
    void test_isBalanced_case5(){
        assertFalse(test.isBalanced("{"));
    }
}