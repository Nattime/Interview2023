package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTheNumberOfConsistentStringsTest{
    private static CountTheNumberOfConsistentStrings test;

    @BeforeAll
    static void beforeAll(){
        test = new CountTheNumberOfConsistentStrings();
    }

    @Test
    @DisplayName("test_countConsistentStrings_case1")
    void test_countConsistentStrings_case1(){
        assertEquals(test.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}), 2);
    }

    @Test
    @DisplayName("test_countConsistentStrings_case2")
    void test_countConsistentStrings_case2(){
        assertEquals(test.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}), 7);
    }

    @Test
    @DisplayName("test_countConsistentStrings_case3")
    void test_countConsistentStrings_case3(){
        assertEquals(test.countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"}), 4);
    }
}