package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumBitFlipsToConvertNumberTest{
    private static MinimumBitFlipsToConvertNumber test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumBitFlipsToConvertNumber();
    }

    @Test
    @DisplayName("test_minBitFlips_case1")
    void test_minBitFlips_case1(){
        assertEquals(test.minBitFlips(10, 7), 3);
    }

    @Test
    @DisplayName("test_minBitFlips_case2")
    void test_minBitFlips_case2(){
        assertEquals(test.minBitFlips(3, 4), 3);
    }

    @Test
    @DisplayName("test_minBitFlips_case3")
    void test_minBitFlips_case3(){
        assertEquals(test.minBitFlips(10, 82), 3);
    }
}