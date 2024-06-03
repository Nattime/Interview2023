package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppendCharactersToStringToMakeSubsequenceTest{
    private static AppendCharactersToStringToMakeSubsequence test;
    
    @BeforeAll
    static void beforeAll(){
        test = new AppendCharactersToStringToMakeSubsequence();
    }
    
    @Test
    @DisplayName("test_appendCharacters_case1")
    void test_appendCharacters_case1(){
        assertEquals(test.appendCharacters("coaching", "coding"), 4);
    }
    
    @Test
    @DisplayName("test_appendCharacters_case2")
    void test_appendCharacters_case2(){
        assertEquals(test.appendCharacters("abcde", "a"), 0);
    }
    
    @Test
    @DisplayName("test_appendCharacters_case3")
    void test_appendCharacters_case3(){
        assertEquals(test.appendCharacters("z", "abcde"), 5);
    }
    
    @Test
    @DisplayName("test_appendCharacters_case4")
    void test_appendCharacters_case4(){
        assertEquals(test.appendCharacters("z", "a"), 1);
    }
}