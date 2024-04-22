package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OpenTheLockTest{
    private static OpenTheLock test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new OpenTheLock();
    }

    @Test
    void TestCase1(){
        assertEquals(test.openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"), 6);
    }

    @Test
    void TestCase2(){
        assertEquals(test.openLock(new String[]{"8888"}, "0009"), 1);
    }

    @Test
    void TestCase3(){
        assertEquals(test.openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888"), -1);
    }
}