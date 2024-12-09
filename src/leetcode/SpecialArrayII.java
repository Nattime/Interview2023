package leetcode;

/**
 * 3152. Special Array II
 */
public class SpecialArrayII{
    public boolean[] isArraySpecial(int[] nums, int[][] queries){
        int[] subArr = new int[nums.length];
        int val = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] % 2 == nums[i - 1] % 2){
                subArr[i] = ++val;
            }else{
                subArr[i] = val;
            }
        }
        boolean[] ret = new boolean[queries.length];
        for(int i = 0; i < queries.length; i++){
            ret[i] = subArr[queries[i][0]] == subArr[queries[i][1]];
        }
        return ret;
    }
}
