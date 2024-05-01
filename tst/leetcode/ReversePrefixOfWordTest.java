package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePrefixOfWordTest{
    private static ReversePrefixOfWord test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ReversePrefixOfWord();
    }

    @Test
    void TestCase1(){
        assertEquals(test.reversePrefix("abcdefd", 'd'), "dcbaefd");
    }

    @Test
    void TestCase2(){
        assertEquals(test.reversePrefix("xyxzxe", 'z'), "zxyxxe");
    }

    @Test
    void TestCase3(){
        assertEquals(test.reversePrefix("abcd", 'z'), "abcd");
    }
}