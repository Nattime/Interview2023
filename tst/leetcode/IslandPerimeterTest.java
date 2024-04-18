package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IslandPerimeterTest{
    private static IslandPerimeter test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new IslandPerimeter();
    }

    @Test
    void TestCase1(){
        int[][] matrix = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        assertEquals(test.islandPerimeter(matrix), 16);
    }

    @Test
    void TestCase2(){
        int[][] matrix = {{1}};
        assertEquals(test.islandPerimeter(matrix), 4);
    }

    @Test
    void TestCase3(){
        int[][] matrix = {{1, 0}};
        assertEquals(test.islandPerimeter(matrix), 4);
    }

    @Test
    void TestCase4(){
        int[][] matrix = {{1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}, {1}};
        assertEquals(test.islandPerimeter(matrix), 42);
    }
}