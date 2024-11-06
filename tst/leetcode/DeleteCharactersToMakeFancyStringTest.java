package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteCharactersToMakeFancyStringTest{
    private static DeleteCharactersToMakeFancyString test;

    @BeforeAll
    static void beforeAll(){
        test = new DeleteCharactersToMakeFancyString();
    }

    @Test
    @DisplayName("test_makeFancyString_case1")
    void test_makeFancyString_case1(){
        assertEquals(test.makeFancyString("leeetcode"), "leetcode");
    }

    @Test
    @DisplayName("test_makeFancyString_case2")
    void test_makeFancyString_case2(){
        assertEquals(test.makeFancyString("aaabaaaa"), "aabaa");
    }

    @Test
    @DisplayName("test_makeFancyString_case3")
    void test_makeFancyString_case3(){
        assertEquals(test.makeFancyString("aab"), "aab");
    }
}