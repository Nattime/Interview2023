package leetcode;

/**
 * 1289. Minimum Falling Path Sum II
 */
public class MinimumFallingPathSumII{
    public int minFallingPathSum(int[][] grid){
        int sum = 0;
        int prev = 0;
        int index = -1;
        for(int[] row : grid){
            int currSum = Integer.MAX_VALUE;
            int prevSum = Integer.MAX_VALUE;
            int currIndex = -1;
            for(int j = 0; j < row.length; ++j){
                int total = row[j];
                if(j != index){
                    total += sum;
                }else{
                    total += prev;
                }
                if(total < currSum){
                    prevSum = currSum;
                    currSum = total;
                    currIndex = j;
                }else if(total < prevSum){
                    prevSum = total;
                }
            }
            sum = currSum;
            prev = prevSum;
            index = currIndex;
        }
        return sum;
    }
}
