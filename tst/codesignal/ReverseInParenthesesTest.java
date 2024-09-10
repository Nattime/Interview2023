package codesignal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseInParenthesesTest{
    private static ReverseInParentheses test;

    @BeforeAll
    static void beforeAll(){
        test = new ReverseInParentheses();
    }

    @Test
    @DisplayName("test_solution_case1")
    void test_solution_case1(){
        assertEquals(test.solution("(bar)"), "rab");
    }

    @Test
    @DisplayName("test_solution_case2")
    void test_solution_case2(){
        assertEquals(test.solution("foo(bar)baz"), "foorabbaz");
    }

    @Test
    @DisplayName("test_solution_case3")
    void test_solution_case3(){
        assertEquals(test.solution("foo(bar(baz))blim"), "foobazrabblim");
    }
}