package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareVersionNumbersTest{
    private static CompareVersionNumbers test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new CompareVersionNumbers();
    }

    @Test
    void TestCase1(){
        assertEquals(test.compareVersion("1.01", "1.001"), 0);
    }

    @Test
    void TestCase2(){
        assertEquals(test.compareVersion("1.0", "1.0.0"), 0);
    }

    @Test
    void TestCase3(){
        assertEquals(test.compareVersion("0.1", "1.1"), -1);
    }

    @Test
    void TestCase4(){
        assertEquals(test.compareVersion("1.0.1.1", "1.0.1"), 1);
    }
}