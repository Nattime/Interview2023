package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest{
    private static CheckIfAWordOccursAsAPrefixOfAnyWordInASentence test;

    @BeforeAll
    static void beforeAll(){
        test = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
    }

    @Test
    @DisplayName("test_isPrefixOfWord_case1")
    void test_isPrefixOfWord_case1(){
        assertEquals(4, test.isPrefixOfWord("i love eating burger", "burg"));
    }

    @Test
    @DisplayName("test_isPrefixOfWord_case2")
    void test_isPrefixOfWord_case2(){
        assertEquals(2, test.isPrefixOfWord("this problem is an easy problem", "pro"));
    }

    @Test
    @DisplayName("test_isPrefixOfWord_case3")
    void test_isPrefixOfWord_case3(){
        assertEquals(-1, test.isPrefixOfWord("i am tired", "you"));
    }
}