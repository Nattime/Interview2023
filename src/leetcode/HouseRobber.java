package leetcode;

/**
 * 198. House Robber
 */
public class HouseRobber{
    public int rob(int[] nums){
        int p0 = 0;
        int p1 = 0;

        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.max(p0 + nums[i], p1);
            p0 = p1;
            p1 = nums[i];
        }

        return p1;
    }
}
