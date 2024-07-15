package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseSubstringsBetweenEachPairOfParenthesesTest{
    private static ReverseSubstringsBetweenEachPairOfParentheses test;
    
    @BeforeAll
    static void beforeAll(){
        test = new ReverseSubstringsBetweenEachPairOfParentheses();
    }
    
    @Test
    @DisplayName("test_reverseParentheses_case1")
    void test_reverseParentheses_case1(){
        assertEquals(test.reverseParentheses("(abcd)"), "dcba");
    }
    
    @Test
    @DisplayName("test_reverseParentheses_case2")
    void test_reverseParentheses_case2(){
        assertEquals(test.reverseParentheses("(u(love)i)"), "iloveu");
    }
    
    @Test
    @DisplayName("test_reverseParentheses_case3")
    void test_reverseParentheses_case3(){
        assertEquals(test.reverseParentheses("(ed(et(oc))el)"), "leetcode");
    }
    
    @Test
    @DisplayName("test_reverseParentheses_case4")
    void test_reverseParentheses_case4(){
        assertEquals(test.reverseParentheses("a(bcdefghijkl(mno)p)q"), "apmnolkjihgfedcbq");
    }
    
    @Test
    @DisplayName("test_reverseParentheses_case5")
    void test_reverseParentheses_case5(){
        assertEquals(test.reverseParentheses("((eqk((h))))"), "eqkh");
    }
}