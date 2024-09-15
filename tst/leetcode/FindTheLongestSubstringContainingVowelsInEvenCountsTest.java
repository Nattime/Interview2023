package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheLongestSubstringContainingVowelsInEvenCountsTest{
    private static FindTheLongestSubstringContainingVowelsInEvenCounts test;

    @BeforeAll
    static void beforeAll(){
        test = new FindTheLongestSubstringContainingVowelsInEvenCounts();
    }

    @Test
    @DisplayName("test_findTheLongestSubstring_case1")
    void test_findTheLongestSubstring_case1(){
        assertEquals(test.findTheLongestSubstring("eleetminicoworoep"), 13);
    }

    @Test
    @DisplayName("test_findTheLongestSubstring_case2")
    void test_findTheLongestSubstring_case2(){
        assertEquals(test.findTheLongestSubstring("leetcodeisgreat"), 5);
    }

    @Test
    @DisplayName("test_findTheLongestSubstring_case3")
    void test_findTheLongestSubstring_case3(){
        assertEquals(test.findTheLongestSubstring("bcbcbc"), 6);
    }
}