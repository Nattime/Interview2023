package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheTownJudgeTest{
    private static FindTheTownJudge test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new FindTheTownJudge();
    }

    @Test
    void TestCase1(){
        int[][] trust = {{1, 2}};
        assertEquals(test.findJudge(2, trust), 2);
    }

    @Test
    void TestCase2(){
        int[][] trust = {{1, 3}, {2, 3}};
        assertEquals(test.findJudge(3, trust), 3);
    }

    @Test
    void TestCase3(){
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
        assertEquals(test.findJudge(3, trust), -1);
    }

    @Test
    void TestCase4(){
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        assertEquals(test.findJudge(4, trust), 3);
    }

    @Test
    void TestCase5(){
        int[][] trust = {{1, 2}, {1, 3}, {2, 1}, {2, 3}, {1, 4}, {4, 3}, {4, 1}};
        assertEquals(test.findJudge(4, trust), 3);
    }
}