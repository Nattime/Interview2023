package leetcode;

import java.util.Arrays;

/**
 * 945. Minimum Increment to Make Array Unique
 */
public class MinimumIncrementToMakeArrayUnique{
    public int minIncrementForUnique(int[] nums){
        int ret = 0;
        int prevNum = 0;
        Arrays.sort(nums);
        for(int num : nums){
            ret += Math.max(prevNum - num, 0);
            prevNum = Math.max(prevNum, num) + 1;
        }
        return ret;
    }
}
