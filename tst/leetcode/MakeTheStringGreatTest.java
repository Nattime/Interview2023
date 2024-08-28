package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MakeTheStringGreatTest{
    private static MakeTheStringGreat test;

    @BeforeAll
    static void beforeAll(){
        test = new MakeTheStringGreat();
    }

    @Test
    @DisplayName("test_makeGood_case1")
    void test_makeGood_case1(){
        assertEquals(test.makeGood("leEeetcode"), "leetcode");
    }

    @Test
    @DisplayName("test_makeGood_case2")
    void test_makeGood_case2(){
        assertEquals(test.makeGood("abBAcC"), "");
    }

    @Test
    @DisplayName("test_makeGood_case3")
    void test_makeGood_case3(){
        assertEquals(test.makeGood("s"), "s");
    }

    @Test
    @DisplayName("test_makeGood_case4")
    void test_makeGood_case4(){
        assertEquals(test.makeGood("hKhHkHjgGJEiBbIe"), "");
    }
}