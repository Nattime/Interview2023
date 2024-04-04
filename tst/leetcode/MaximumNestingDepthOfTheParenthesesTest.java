package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNestingDepthOfTheParenthesesTest{
    private static MaximumNestingDepthOfTheParentheses test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MaximumNestingDepthOfTheParentheses();
    }

    @Test
    void TestCase1(){
        assertEquals(test.maxDepth("(1+(2*3)+((8)/4))+1"), 3);
    }

    @Test
    void TestCase2(){
        assertEquals(test.maxDepth("(1)+((2))+(((3)))"), 3);
    }

    @Test
    void TestCase3(){
    }
}