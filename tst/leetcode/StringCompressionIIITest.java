package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionIIITest{
    private static StringCompressionIII test;

    @BeforeAll
    static void beforeAll(){
        test = new StringCompressionIII();
    }

    @Test
    @DisplayName("test_compressedString_case1")
    void test_compressedString_case1(){
        assertEquals(test.compressedString("abcde"), "1a1b1c1d1e");
    }

    @Test
    @DisplayName("test_compressedString_case2")
    void test_compressedString_case2(){
        assertEquals(test.compressedString("aaaaaaaaaaaaaabb"), "9a5a2b");
    }

    @Test
    @DisplayName("test_compressedString_case3")
    void test_compressedString_case3(){
        assertEquals(test.compressedString("abcdea"), "1a1b1c1d1e1a");
    }
}