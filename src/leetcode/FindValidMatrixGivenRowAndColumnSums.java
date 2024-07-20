package leetcode;

/**
 * 1605. Find Valid Matrix Given Row and Column Sums
 */
public class FindValidMatrixGivenRowAndColumnSums{
    public int[][] restoreMatrix(int[] rowSum, int[] colSum){
        int[][] ret = new int[rowSum.length][colSum.length];
        for(int row = 0; row < rowSum.length; row++){
            for(int col = 0; col < colSum.length; col++){
                ret[row][col] = Math.min(rowSum[row], colSum[col]);
                rowSum[row] -= ret[row][col];
                colSum[col] -= ret[row][col];
            }
        }
        return ret;
    }
}
