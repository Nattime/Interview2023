package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoKeysKeyboardTest{
    private static TwoKeysKeyboard test;

    @BeforeAll
    static void beforeAll(){
        test = new TwoKeysKeyboard();
    }

    @Test
    @DisplayName("test_minSteps_case1")
    void test_minSteps_case1(){
        assertEquals(test.minSteps(3), 3);
    }

    @Test
    @DisplayName("test_minSteps_case2")
    void test_minSteps_case2(){
        assertEquals(test.minSteps(1), 0);
    }

    @Test
    @DisplayName("test_minSteps_case3")
    void test_minSteps_case3(){
        assertEquals(test.minSteps(124), 35);
    }

    @Test
    @DisplayName("test_minSteps_case4")
    void test_minSteps_case4(){
        assertEquals(test.minSteps(111), 40);
    }
}