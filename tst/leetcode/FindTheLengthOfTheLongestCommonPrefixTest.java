package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheLengthOfTheLongestCommonPrefixTest{
    private static FindTheLengthOfTheLongestCommonPrefix test;

    @BeforeAll
    static void beforeAll(){
        test = new FindTheLengthOfTheLongestCommonPrefix();
    }

    @Test
    @DisplayName("test_longestCommonPrefix_case1")
    void test_longestCommonPrefix_case1(){
        assertEquals(test.longestCommonPrefix(new int[]{1, 10, 100}, new int[]{100}), 3);
    }

    @Test
    @DisplayName("test_longestCommonPrefix_case2")
    void test_longestCommonPrefix_case2(){
        assertEquals(test.longestCommonPrefix(new int[]{1, 2, 3}, new int[]{4, 4, 4}), 0);
    }
}