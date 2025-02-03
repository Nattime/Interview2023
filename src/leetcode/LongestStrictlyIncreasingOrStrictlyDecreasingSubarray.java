package leetcode;

/**
 * 3105. Longest Strictly Increasing or Strictly Decreasing Subarray
 */
public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray{
    public int longestMonotonicSubarray(int[] nums){
        int ret = 1;
        int inc = 1;
        int dec = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                dec++;
                inc = 1;
            }else if(nums[i] > nums[i - 1]){
                inc++;
                dec = 1;
            }else{
                inc = 1;
                dec = 1;
            }
            ret = Math.max(Math.max(inc, dec), ret);
        }
        return ret;
    }
}
