package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLengthOfStringAfterOperationsTest{
    private static MinimumLengthOfStringAfterOperations test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumLengthOfStringAfterOperations();
    }

    @Test
    @DisplayName("test_minimumLength_case1")
    void test_minimumLength_case1(){
        assertEquals(5, test.minimumLength("abaacbcbb"));
    }

    @Test
    @DisplayName("test_minimumLength_case2")
    void test_minimumLength_case2(){
        assertEquals(2, test.minimumLength("aa"));
    }

    @Test
    @DisplayName("test_minimumLength_case3")
    void test_minimumLength_case3(){

    }
}