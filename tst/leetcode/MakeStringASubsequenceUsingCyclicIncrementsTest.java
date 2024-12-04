package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeStringASubsequenceUsingCyclicIncrementsTest{
    private static MakeStringASubsequenceUsingCyclicIncrements test;

    @BeforeAll
    static void beforeAll(){
        test = new MakeStringASubsequenceUsingCyclicIncrements();
    }

    @Test
    @DisplayName("test_canMakeSubsequence_case1")
    void test_canMakeSubsequence_case1(){
        assertEquals(true, test.canMakeSubsequence("abc", "ad"));
    }

    @Test
    @DisplayName("test_canMakeSubsequence_case2")
    void test_canMakeSubsequence_case2(){
        assertEquals(true, test.canMakeSubsequence("zc", "ad"));
    }

    @Test
    @DisplayName("test_canMakeSubsequence_case3")
    void test_canMakeSubsequence_case3(){
        assertEquals(false, test.canMakeSubsequence("ab", "d"));
    }
}