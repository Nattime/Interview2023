package leetcode;

/**
 * 3151. Special Array I
 */
public class SpecialArrayI{
    public boolean isArraySpecial(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if((nums[i] % 2) + (nums[i - 1] % 2) != 1){
                return false;
            }
        }
        return true;
    }
}
