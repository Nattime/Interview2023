package leetcode;

/**
 * 330. Patching Array
 */
public class PatchingArray{
    public int minPatches(int[] nums, int n){
        int i = 0;
        int ret = 0;
        long m = 1;
        while(m <= n){
            if(i < nums.length && nums[i] <= m){
                m += nums[i++];
            }else{
                m += m;
                ret++;
            }
        }
        return ret;
    }
}
