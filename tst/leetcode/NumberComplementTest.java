package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComplementTest{
    private static NumberComplement test;

    @BeforeAll
    static void beforeAll(){
        test = new NumberComplement();
    }

    @Test
    @DisplayName("test_findComplement_case1")
    void test_findComplement_case1(){
        assertEquals(test.findComplement(5), 2);
    }

    @Test
    @DisplayName("test_findComplement_case2")
    void test_findComplement_case2(){
        assertEquals(test.findComplement(1), 0);
    }
}