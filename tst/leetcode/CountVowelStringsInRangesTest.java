package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountVowelStringsInRangesTest{
    private static CountVowelStringsInRanges test;

    @BeforeAll
    static void beforeAll(){
        test = new CountVowelStringsInRanges();
    }

    @Test
    @DisplayName("test_vowelStrings_case1")
    void test_vowelStrings_case1(){
        assertArrayEquals(new int[]{2, 3, 0}, test.vowelStrings(new String[]{"aba", "bcb", "ece", "aa", "e"}, new int[][]{{0, 2}, {1, 4}, {1, 1}}));
    }

    @Test
    @DisplayName("test_vowelStrings_case2")
    void test_vowelStrings_case2(){
        assertArrayEquals(new int[]{3, 2, 1}, test.vowelStrings(new String[]{"a", "e", "i"}, new int[][]{{0, 2}, {0, 1}, {2, 2}}));
    }

    @Test
    @DisplayName("test_vowelStrings_case3")
    void test_vowelStrings_case3(){

    }
}