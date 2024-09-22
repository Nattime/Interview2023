package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LexicographicalNumbersTest{
    private static LexicographicalNumbers test;

    @BeforeAll
    static void beforeAll(){
        test = new LexicographicalNumbers();
    }

    @Test
    @DisplayName("test_lexicalOrder_case1")
    void test_lexicalOrder_case1(){
        List<Integer> expected = Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(test.lexicalOrder(13), expected);
    }

    @Test
    @DisplayName("test_lexicalOrder_case2")
    void test_lexicalOrder_case2(){
        List<Integer> expected = Arrays.asList(1, 2);
        assertEquals(test.lexicalOrder(2), expected);
    }
}