package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindCommonCharactersTest{
    private static FindCommonCharacters test;
    
    @BeforeAll
    static void beforeAll(){
        test = new FindCommonCharacters();
    }
    
    @Test
    @DisplayName("test_commonChars_case1")
    void test_commonChars_case1(){
        List<String> output = List.of(new String[]{"e", "l", "l"});
        assertEquals(test.commonChars(new String[]{"bella", "label", "roller"}), output);
    }
    
    @Test
    @DisplayName("test_commonChars_case2")
    void test_commonChars_case2(){
        List<String> output = List.of(new String[]{"c", "o"});
        assertEquals(test.commonChars(new String[]{"cool", "lock", "cook"}), output);
    }
    
    @Test
    @DisplayName("test_commonChars_case3")
    void test_commonChars_case3(){
    
    }
}