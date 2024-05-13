package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreAfterFlippingMatrixTest{
    private static ScoreAfterFlippingMatrix test;

    @BeforeAll
    public static void setup(){
        test = new ScoreAfterFlippingMatrix();
    }

    @Test
    void TestCase1(){
        assertEquals(test.matrixScore(new int[][]{{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}}), 39);
    }

    @Test
    void TestCase2(){
        assertEquals(test.matrixScore(new int[][]{{0}}), 1);
    }

    @Test
    void TestCase3(){
        assertEquals(test.matrixScore(new int[][]{{0, 1, 0, 0}, {0, 1, 1, 0}, {1, 1, 1, 0}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 1, 1, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}, {1, 1, 1, 0}}), 113);
    }
}