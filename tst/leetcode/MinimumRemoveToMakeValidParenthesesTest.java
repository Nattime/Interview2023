package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumRemoveToMakeValidParenthesesTest{
    private static MinimumRemoveToMakeValidParentheses test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinimumRemoveToMakeValidParentheses();
    }

    @Test
    void TestCase1(){
        assertEquals(test.minRemoveToMakeValid("lee(t(c)o)de)"), "lee(t(c)o)de");
    }

    @Test
    void TestCase2(){
        assertEquals(test.minRemoveToMakeValid("a)b(c)d"), "ab(c)d");
    }

    @Test
    void TestCase3(){
        assertEquals(test.minRemoveToMakeValid("))(("), "");
    }
}