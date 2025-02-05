package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CheckIfOneStringSwapCanMakeStringsEqualTest{
    private static CheckIfOneStringSwapCanMakeStringsEqual test;

    @BeforeAll
    static void beforeAll(){
        test = new CheckIfOneStringSwapCanMakeStringsEqual();
    }

    @Test
    @DisplayName("test_areAlmostEqual_case1")
    void test_areAlmostEqual_case1(){
        assertTrue(test.areAlmostEqual("bank", "kanb"));
    }

    @Test
    @DisplayName("test_areAlmostEqual_case2")
    void test_areAlmostEqual_case2(){
        assertFalse(test.areAlmostEqual("attack", "defend"));
    }

    @Test
    @DisplayName("test_areAlmostEqual_case3")
    void test_areAlmostEqual_case3(){
        assertTrue(test.areAlmostEqual("kelb", "kelb"));
    }
}