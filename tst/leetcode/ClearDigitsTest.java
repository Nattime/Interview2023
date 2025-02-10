package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClearDigitsTest{
    private static ClearDigits test;

    @BeforeAll
    static void beforeAll(){
        test = new ClearDigits();
    }

    @Test
    @DisplayName("test_clearDigits_case1")
    void test_clearDigits_case1(){
        assertEquals("abc", test.clearDigits("abc"));
    }

    @Test
    @DisplayName("test_clearDigits_case2")
    void test_clearDigits_case2(){
        assertEquals("", test.clearDigits("cb34"));
    }

    @Test
    @DisplayName("test_clearDigits_case3")
    void test_clearDigits_case3(){

    }
}