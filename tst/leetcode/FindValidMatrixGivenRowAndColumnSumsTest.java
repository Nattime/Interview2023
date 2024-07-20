package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FindValidMatrixGivenRowAndColumnSumsTest{
    private static FindValidMatrixGivenRowAndColumnSums test;
    
    @BeforeAll
    static void beforeAll(){
        test = new FindValidMatrixGivenRowAndColumnSums();
    }
    
    private boolean sumEquals(int[][] mat, int[] rowSum, int[] colSum){
        int rLen = rowSum.length;
        int cLen = colSum.length;
        int[] r = new int[rLen];
        int[] c = new int[cLen];
        for(int row = 0; row < rLen; row++){
            for(int col = 0; col < cLen; col++){
                r[row] += mat[row][col];
                c[col] += mat[row][col];
            }
        }
        for(int i = 0; i < c.length; i++){
            if(c[i] != colSum[i]){
                return false;
            }
        }
        for(int i = 0; i < r.length; i++){
            if(r[i] != rowSum[i]){
                return false;
            }
        }
        return true;
    }
    
    @Test
    @DisplayName("test_restoreMatrix_case1")
    void test_restoreMatrix_case1(){
        assertArrayEquals(test.restoreMatrix(new int[]{3, 8}, new int[]{4, 7}), new int[][]{{3, 0}, {1, 7}});
    }
    
    @Test
    @DisplayName("test_restoreMatrix_case2")
    void test_restoreMatrix_case2(){
        int[] rowSum = new int[]{5, 7, 10};
        int[] colSum = new int[]{8, 6, 8};
        int[][] mat = test.restoreMatrix(rowSum, colSum);
        assertTrue(sumEquals(mat, new int[]{5, 7, 10}, new int[]{8, 6, 8}));
    }
}