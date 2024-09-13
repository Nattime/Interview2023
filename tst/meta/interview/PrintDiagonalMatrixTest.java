package meta.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrintDiagonalMatrixTest{
    private static PrintDiagonalMatrix test;

    @BeforeAll
    static void beforeAll(){
        test = new PrintDiagonalMatrix();
    }

    @Test
    @DisplayName("test_printDiagonal_case1")
    void test_printDiagonal_case1(){
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        test.printDiagonal(matrix);
    }
}