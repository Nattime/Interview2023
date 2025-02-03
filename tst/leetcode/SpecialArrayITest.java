package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialArrayITest{
    private static SpecialArrayI test;

    @BeforeAll
    static void beforeAll(){
        test = new SpecialArrayI();
    }

    @Test
    @DisplayName("test_isArraySpecial_case1")
    void test_isArraySpecial_case1(){
        assertTrue(test.isArraySpecial(new int[]{1}));
    }

    @Test
    @DisplayName("test_isArraySpecial_case2")
    void test_isArraySpecial_case2(){
        assertTrue(test.isArraySpecial(new int[]{2, 1, 4}));
    }

    @Test
    @DisplayName("test_isArraySpecial_case3")
    void test_isArraySpecial_case3(){
        assertFalse(test.isArraySpecial(new int[]{4, 3, 1, 6}));
    }
}