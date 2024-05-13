package leetcode;

/**
 * 861. Score After Flipping Matrix
 */
public class ScoreAfterFlippingMatrix{
    public int matrixScore(int[][] grid){
        int len = grid.length;
        int colLen = grid[0].length;
        int[][] colCount = new int[colLen][2];
        // flip row starting with 0
        for(int row = 0; row < len; row++){
            int val = grid[row][0];
            if(val == 0){
                for(int col = 0; col < colLen; col++){
                    if(grid[row][col] == 1){
                        grid[row][col] = 0;
                    }else{
                        grid[row][col] = 1;
                    }
                }
            }
        }
        // count number of 0 and 1 in columns
        for(int row = 0; row < len; row++){
            for(int col = 0; col < colLen; col++){
                int val = grid[row][col];
                if(val == 0){
                    colCount[col][0]++;
                }else{
                    colCount[col][1]++;
                }
            }
        }
        // flip col if number of 0s > 1s
        for(int i = 0; i < colLen; i++){
            if(colCount[i][0] > colCount[i][1]){
                for(int row = 0; row < len; row++){
                    if(grid[row][i] == 0){
                        grid[row][i] = 1;
                    }else{
                        grid[row][i] = 0;
                    }
                }
            }
        }
        int ret = 0;
        for(int row = 0; row < len; row++){
            int num = grid[row][0];
            for(int col = 1; col < colLen; col++){
                num = num * 2 + grid[row][col];
            }
            ret += num;
        }
        return ret;
    }
}
