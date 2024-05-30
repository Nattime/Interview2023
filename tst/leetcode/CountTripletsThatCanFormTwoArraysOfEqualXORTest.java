package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountTripletsThatCanFormTwoArraysOfEqualXORTest{
    private static CountTripletsThatCanFormTwoArraysOfEqualXOR test;
    
    @BeforeAll
    static void beforeAll(){
        test = new CountTripletsThatCanFormTwoArraysOfEqualXOR();
    }
    
    @Test
    @DisplayName("test_countTriplets_case1")
    void test_countTriplets_case1(){
        assertEquals(test.countTriplets(new int[]{2, 3, 1, 6, 7}), 4);
    }
    
    @Test
    @DisplayName("test_countTriplets_case2")
    void test_countTriplets_case2(){
        assertEquals(test.countTriplets(new int[]{1, 1, 1, 1, 1}), 10);
    }
    
    @Test
    @DisplayName("test_countTriplets_case3")
    void test_countTriplets_case3(){
    
    }
}