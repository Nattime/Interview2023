package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularSentenceTest{
    private static CircularSentence test;

    @BeforeAll
    static void beforeAll(){
        test = new CircularSentence();
    }

    @Test
    @DisplayName("test_isCircularSentence_case1")
    void test_isCircularSentence_case1(){
        assertTrue(test.isCircularSentence("leetcode exercises sound delightful"));
    }

    @Test
    @DisplayName("test_isCircularSentence_case2")
    void test_isCircularSentence_case2(){
        assertTrue(test.isCircularSentence("eetcode"));
    }

    @Test
    @DisplayName("test_isCircularSentence_case3")
    void test_isCircularSentence_case3(){
        assertFalse(test.isCircularSentence("Leetcode is cool"));
    }
}