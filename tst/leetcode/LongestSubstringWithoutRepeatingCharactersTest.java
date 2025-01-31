package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest{
    private static LongestSubstringWithoutRepeatingCharacters test;

    @BeforeAll
    static void beforeAll(){
        test = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    @DisplayName("test_lengthOfLongestSubstring_case1")
    void test_lengthOfLongestSubstring_case1(){
        assertEquals(3, test.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("test_lengthOfLongestSubstring_case2")
    void test_lengthOfLongestSubstring_case2(){
        assertEquals(1, test.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("test_lengthOfLongestSubstring_case3")
    void test_lengthOfLongestSubstring_case3(){
        assertEquals(3, test.lengthOfLongestSubstring("pwwkew"));
    }
}