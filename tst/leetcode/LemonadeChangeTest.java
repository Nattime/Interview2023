package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LemonadeChangeTest{
    private static LemonadeChange test;

    @BeforeAll
    static void beforeAll(){
        test = new LemonadeChange();
    }

    @Test
    @DisplayName("test_lemonadeChange_case1")
    void test_lemonadeChange_case1(){
        assertEquals(test.lemonadeChange(new int[]{5, 5, 5, 10, 20}), true);
    }

    @Test
    @DisplayName("test_lemonadeChange_case2")
    void test_lemonadeChange_case2(){
        assertEquals(test.lemonadeChange(new int[]{5, 5, 10, 10, 20}), false);
    }
}