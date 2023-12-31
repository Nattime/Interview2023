package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestSubstringBetweenTwoEqualCharactersTest{

    private LargestSubstringBetweenTwoEqualCharacters testObject;

    @BeforeEach
    public void setUp(){
        testObject = new LargestSubstringBetweenTwoEqualCharacters();
    }

    @Test
    void Test1(){
        String str = "aa";
        int ret = testObject.maxLengthBetweenEqualCharacters(str);
        assertEquals(ret, 0);
    }

    @Test
    void Test2(){
        String str = "abca";
        int ret = testObject.maxLengthBetweenEqualCharacters(str);
        assertEquals(ret, 2);
    }

    @Test
    void Test3(){
        String str = "cbzxy";
        int ret = testObject.maxLengthBetweenEqualCharacters(str);
        assertEquals(ret, -1);
    }

    @Test
    void Test4(){
        String str = "mgntdygtxrvxjnwksqhxuxtrv";
        int ret = testObject.maxLengthBetweenEqualCharacters(str);
        assertEquals(ret, 18);
    }
}