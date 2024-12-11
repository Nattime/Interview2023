package leetcode;

import java.util.Arrays;

/**
 * 2779. Maximum Beauty of an Array After Applying Operation
 */
public class MaximumBeautyOfAnArrayAfterApplyingOperation{
    public int maximumBeauty(int[] nums, int k){
        int r = 0;
        int l = 0;
        Arrays.sort(nums);
        for(; r < nums.length; r++){
            if(nums[r] - nums[l] > 2 * k){
                l++;
            }
        }
        return r - l;
    }
}
