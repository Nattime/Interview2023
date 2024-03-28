package leetcode;

/**
 * 713. Subarray Product Less Than K
 */
public class SubarrayProductLessThanK{
    public int numSubarrayProductLessThanK(int[] nums, int k){
        if(k <= 1){
            return 0;
        }
        int count = 0;
        int prod = 1;
        for(int i = 0, j = 0; i < nums.length; i++){
            prod *= nums[i];
            while(prod >= k){
                prod /= nums[j++];
            }
            count += (i - j) + 1;
        }
        return count;
    }
}
