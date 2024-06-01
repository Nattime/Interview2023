package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreOfAStringTest{
    private static ScoreOfAString test;
    
    @BeforeAll
    static void beforeAll(){
        test = new ScoreOfAString();
    }
    
    @Test
    @DisplayName("test_scoreOfString_case1")
    void test_scoreOfString_case1(){
        assertEquals(test.scoreOfString("hello"), 13);
    }
    
    @Test
    @DisplayName("test_scoreOfString_case2")
    void test_scoreOfString_case2(){
        assertEquals(test.scoreOfString("zaz"), 50);
    }
    
    @Test
    @DisplayName("test_scoreOfString_case3")
    void test_scoreOfString_case3(){
    
    }
}