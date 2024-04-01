package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest{
    private static LengthOfLastWord test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new LengthOfLastWord();
    }

    @Test
    void TestCase1(){
        assertEquals(test.lengthOfLastWord("Hello World"), 5);
    }

    @Test
    void TestCase2(){
        assertEquals(test.lengthOfLastWord("   fly me   to   the moon  "), 4);
    }

    @Test
    void TestCase3(){
        assertEquals(test.lengthOfLastWord("luffy is still joyboy"), 6);
    }

    @Test
    void TestCase4(){
        assertEquals(test.lengthOfLastWord("a "), 1);
    }
}