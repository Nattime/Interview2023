package leetcode;

/**
 * 1310. XOR Queries of a Subarray
 */
public class XORQueriesOfASubarray{
    public int[] xorQueries(int[] arr, int[][] queries){
        int len = arr.length;
        int[] preSum = new int[len + 1];
        int[] ret = new int[queries.length];
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum ^= arr[i];
            preSum[i + 1] = sum;
        }
        preSum[1] = arr[0];
        for(int i = 0; i < queries.length; i++){
            ret[i] = preSum[queries[i][0]] ^ preSum[queries[i][1] + 1];
        }
        return ret;
    }
}
