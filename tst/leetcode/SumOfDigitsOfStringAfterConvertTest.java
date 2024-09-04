package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfDigitsOfStringAfterConvertTest{
    private static SumOfDigitsOfStringAfterConvert test;

    @BeforeAll
    static void beforeAll(){
        test = new SumOfDigitsOfStringAfterConvert();
    }

    @Test
    @DisplayName("test_getLucky_case1")
    void test_getLucky_case1(){
        assertEquals(test.getLucky("iiii", 1), 36);
    }

    @Test
    @DisplayName("test_getLucky_case2")
    void test_getLucky_case2(){
        assertEquals(test.getLucky("leetcode", 2), 6);
    }

    @Test
    @DisplayName("test_getLucky_case3")
    void test_getLucky_case3(){
        assertEquals(test.getLucky("zbax", 2), 8);
    }
}