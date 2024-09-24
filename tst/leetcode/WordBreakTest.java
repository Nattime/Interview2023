package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordBreakTest{
    private static WordBreak test;

    @BeforeAll
    static void beforeAll(){
        test = new WordBreak();
    }

    @Test
    @DisplayName("test_wordBreak_case1")
    void test_wordBreak_case1(){
        List<String> input = Arrays.asList("leet", "code");
        assertEquals(test.wordBreak("leetcode", input), true);
    }

    @Test
    @DisplayName("test_wordBreak_case2")
    void test_wordBreak_case2(){
        List<String> input = Arrays.asList("apple", "pen");
        assertEquals(test.wordBreak("applepenapple", input), true);
    }

    @Test
    @DisplayName("test_wordBreak_case3")
    void test_wordBreak_case3(){
        List<String> input = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertEquals(test.wordBreak("catsandog", input), false);
    }
}