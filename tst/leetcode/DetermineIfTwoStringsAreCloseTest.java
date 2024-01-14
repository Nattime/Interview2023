package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineIfTwoStringsAreCloseTest{
    private static DetermineIfTwoStringsAreClose test;

    @BeforeAll
    public static void setUp(){
        test = new DetermineIfTwoStringsAreClose();
    }

    @Test
    void TestCase1(){
        String word1 = "abc";
        String word2 = "bca";
        assertEquals(test.closeStrings(word1, word2), true);
    }

    @Test
    void TestCase2(){
        String word1 = "a";
        String word2 = "aa";
        assertEquals(test.closeStrings(word1, word2), false);
    }

    @Test
    void TestCase3(){
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertEquals(test.closeStrings(word1, word2), true);
    }

    @Test
    void TestCase4(){
        String word1 = "uau";
        String word2 = "ssx";
        assertEquals(test.closeStrings(word1, word2), false);
    }
}