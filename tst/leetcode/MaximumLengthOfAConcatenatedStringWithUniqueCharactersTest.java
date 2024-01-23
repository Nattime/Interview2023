package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest{
    private static MaximumLengthOfAConcatenatedStringWithUniqueCharacters test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();
    }

    @Test
    void TestCase1(){
        List<String> list = List.of(new String[]{"un", "iq", "ue"});
        assertEquals(test.maxLength(list), 4);
    }

    @Test
    void TestCase2(){
        List<String> list = List.of(new String[]{"cha", "r", "act", "ers"});
        assertEquals(test.maxLength(list), 6);
    }

    @Test
    void TestCase3(){
        List<String> list = List.of(new String[]{"abcdefghijklmnopqrstuvwxyz"});
        assertEquals(test.maxLength(list), 26);
    }

    @Test
    void TestCase4(){
        List<String> list = List.of(new String[]{"aa", "bb"});
        assertEquals(test.maxLength(list), 0);
    }

    @Test
    void TestCase5(){
        List<String> list = List.of(new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"});
        assertEquals(test.maxLength(list), 16);
    }

    @Test
    void TestCase6(){
        List<String> list = List.of(new String[]{"jnfbyktlrqumowxd", "mvhgcpxnjzrdei"});
        assertEquals(test.maxLength(list), 16);
    }
}