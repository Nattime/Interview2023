package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumArrayEndTest{
    private static MinimumArrayEnd test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumArrayEnd();
    }

    @Test
    @DisplayName("test_minEnd_case1")
    void test_minEnd_case1(){
        assertEquals(test.minEnd(3, 4), 6);
    }

    @Test
    @DisplayName("test_minEnd_case2")
    void test_minEnd_case2(){
        assertEquals(test.minEnd(2, 7), 15);
    }
}