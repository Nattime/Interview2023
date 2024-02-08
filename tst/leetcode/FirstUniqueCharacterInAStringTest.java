package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstUniqueCharacterInAStringTest{
    private static FirstUniqueCharacterInAString test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new FirstUniqueCharacterInAString();
    }

    @Test
    void TestCase1(){
        assertEquals(test.firstUniqChar("leetcode"), 0);
    }

    @Test
    void TestCase2(){
        assertEquals(test.firstUniqChar("loveleetcode"), 2);
    }

    @Test
    void TestCase3(){
        assertEquals(test.firstUniqChar("aabb"), -1);
    }
}