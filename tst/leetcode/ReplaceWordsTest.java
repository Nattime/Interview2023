package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReplaceWordsTest{
    private static ReplaceWords test;
    
    @BeforeAll
    static void beforeAll(){
        test = new ReplaceWords();
    }
    
    @Test
    @DisplayName("test_replaceWords_case1")
    void test_replaceWords_case1(){
        List<String> input = List.of(new String[]{"cat", "bat", "rat"});
        assertEquals(test.replaceWords(input, "the cattle was rattled by the battery"), "the cat was rat by the bat");
    }
    
    @Test
    @DisplayName("test_replaceWords_case2")
    void test_replaceWords_case2(){
        List<String> input = List.of(new String[]{"a", "b", "c"});
        assertEquals(test.replaceWords(input, "aadsfasf absbs bbab cadsfafs"), "a a b c");
    }
}