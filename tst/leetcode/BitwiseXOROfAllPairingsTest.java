package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseXOROfAllPairingsTest{
    private static BitwiseXOROfAllPairings test;

    @BeforeAll
    static void beforeAll(){
        test = new BitwiseXOROfAllPairings();
    }

    @Test
    @DisplayName("test_xorAllNums_case1")
    void test_xorAllNums_case1(){
        assertEquals(13, test.xorAllNums(new int[]{2, 1, 3}, new int[]{10, 2, 5, 0}));
    }

    @Test
    @DisplayName("test_xorAllNums_case2")
    void test_xorAllNums_case2(){
        assertEquals(0, test.xorAllNums(new int[]{1, 2}, new int[]{3, 4}));
    }

    @Test
    @DisplayName("test_xorAllNums_case3")
    void test_xorAllNums_case3(){

    }
}