package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UncommonWordsFromTwoSentencesTest{
    private static UncommonWordsFromTwoSentences test;

    @BeforeAll
    static void beforeAll(){
        test = new UncommonWordsFromTwoSentences();
    }

    @Test
    @DisplayName("test_uncommonFromSentences_case1")
    void test_uncommonFromSentences_case1(){
        assertArrayEquals(test.uncommonFromSentences("this apple is sweet", "this apple is sour"), new String[]{"sweet", "sour"});
    }

    @Test
    @DisplayName("test_uncommonFromSentences_case2")
    void test_uncommonFromSentences_case2(){
        assertArrayEquals(test.uncommonFromSentences("apple apple", "banana"), new String[]{"banana"});
    }
}