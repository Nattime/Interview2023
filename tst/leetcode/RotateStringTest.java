package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateStringTest{
    private static RotateString test;

    @BeforeAll
    static void beforeAll(){
        test = new RotateString();
    }

    @Test
    @DisplayName("test_rotateString_case1")
    void test_rotateString_case1(){
        assertTrue(test.rotateString("abcde", "cdeab"));
    }

    @Test
    @DisplayName("test_rotateString_case2")
    void test_rotateString_case2(){
        assertFalse(test.rotateString("abcde", "abced"));
    }
}