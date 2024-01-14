package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvaluateReversePolishNotationTest{
    private static EvaluateReversePolishNotation test;

    @BeforeAll
    public static void setUp(){
        test = new EvaluateReversePolishNotation();
    }

    @Test
    void TestCase1(){
        String[] arr = new String[]{"2", "1", "+", "3", "*"};
        assertEquals(test.evalRPN(arr), 9);
    }

    @Test
    void TestCase2(){
        String[] arr = new String[]{"4", "13", "5", "/", "+"};
        assertEquals(test.evalRPN(arr), 6);
    }

    @Test
    void TestCase3(){
        String[] arr = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(test.evalRPN(arr), 22);
    }
}