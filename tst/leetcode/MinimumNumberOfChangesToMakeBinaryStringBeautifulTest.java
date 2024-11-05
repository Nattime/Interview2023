package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfChangesToMakeBinaryStringBeautifulTest{
    private static MinimumNumberOfChangesToMakeBinaryStringBeautiful test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumNumberOfChangesToMakeBinaryStringBeautiful();
    }

    @Test
    @DisplayName("test_minChanges_case1")
    void test_minChanges_case1(){
        assertEquals(test.minChanges("1001"), 2);
    }

    @Test
    @DisplayName("test_minChanges_case2")
    void test_minChanges_case2(){
        assertEquals(test.minChanges("10"), 1);
    }

    @Test
    @DisplayName("test_minChanges_case3")
    void test_minChanges_case3(){
        assertEquals(test.minChanges("0000"), 0);
    }
}