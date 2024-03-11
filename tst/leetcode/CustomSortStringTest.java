package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomSortStringTest{
    private static CustomSortString test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new CustomSortString();
    }

    @Test
    void TestCase1(){
        assertEquals(test.customSortString("cba", "abcd"), "cbad");
    }

    @Test
    void TestCase2(){
        assertEquals(test.customSortString("bcafg", "abcd"), "bcad");
    }

    @Test
    void TestCase3(){
        assertEquals(test.customSortString("kqep", "pekeq"), "kqeep");
    }

    @Test
    void TestCase4(){
        assertEquals(test.customSortString("kqep", "pekeqkkp"), "kkkqeepp");
    }
}