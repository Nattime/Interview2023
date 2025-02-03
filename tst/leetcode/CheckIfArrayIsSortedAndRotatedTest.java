package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfArrayIsSortedAndRotatedTest{
    private static CheckIfArrayIsSortedAndRotated test;

    @BeforeAll
    static void beforeAll(){
        test = new CheckIfArrayIsSortedAndRotated();
    }

    @Test
    @DisplayName("test_check_case1")
    void test_check_case1(){
        assertTrue(test.check(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    @DisplayName("test_check_case2")
    void test_check_case2(){
        assertFalse(test.check(new int[]{2, 1, 3, 4}));
    }

    @Test
    @DisplayName("test_check_case3")
    void test_check_case3(){
        assertTrue(test.check(new int[]{1, 2, 3}));
    }

    @Test
    @DisplayName("test_check_case4")
    void test_check_case4(){
        assertFalse(test.check(new int[]{1, 4, 1, 2, 3, 5}));
    }
}