package leetcode;

import java.util.Arrays;

/**
 * 2563. Count the Number of Fair Pairs
 */
public class CountTheNumberOfFairPairs{
    public long countFairPairs(int[] nums, int lower, int upper){
        Arrays.sort(nums);
        long ret = 0L;
        for(int i = 0, j = nums.length - 1; i < j; ++i){
            while(i < j && nums[i] + nums[j] > upper){
                --j;
            }
            ret += j - i;
        }
        for(int i = 0, j = nums.length - 1; i < j; ++i){
            while(i < j && nums[i] + nums[j] > lower - 1){
                --j;
            }
            ret -= j - i;
        }
        return ret;
    }
}
