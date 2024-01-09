package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest{
    private static ContainerWithMostWater test;

    @BeforeAll
    public static void setUp(){
        test = new ContainerWithMostWater();
    }

    @Test
    void TestCase1(){
        int height[] = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(test.maxArea(height), 49);
    }

    @Test
    void TestCase2(){
        int height[] = new int[]{1, 1};
        assertEquals(test.maxArea(height), 1);
    }

    @Test
    void TestCase3(){
    }
}