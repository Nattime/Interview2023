package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KokoEatingBananasTest{
    private static KokoEatingBananas test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new KokoEatingBananas();
    }

    @Test
    void TestCase1(){
        int[] piles = new int[]{3, 6, 7, 11};
        assertEquals(test.minEatingSpeed(piles, 8), 4);
    }

    @Test
    void TestCase2(){
        int[] piles = new int[]{30, 11, 23, 4, 20};
        assertEquals(test.minEatingSpeed(piles, 5), 30);
    }

    @Test
    void TestCase3(){
        int[] piles = new int[]{30, 11, 23, 4, 20};
        assertEquals(test.minEatingSpeed(piles, 6), 23);
    }
}