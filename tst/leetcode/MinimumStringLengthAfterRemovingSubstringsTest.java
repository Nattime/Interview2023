package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumStringLengthAfterRemovingSubstringsTest{
    private static MinimumStringLengthAfterRemovingSubstrings test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumStringLengthAfterRemovingSubstrings();
    }

    @Test
    @DisplayName("test_minLength_case1")
    void test_minLength_case1(){
        assertEquals(test.minLength("ABFCACDB"), 2);
    }

    @Test
    @DisplayName("test_minLength_case2")
    void test_minLength_case2(){
        assertEquals(test.minLength("ACBBD"), 5);
    }
}