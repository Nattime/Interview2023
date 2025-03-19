package leetcode;

/**
 * 3191. Minimum Operations to Make Binary Array Elements Equal to One I
 */
public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI{
    public int minOperations(int[] nums){
        final int len = nums.length;
        int count = 0;
        for(int i = 0; i < len - 2; i++){
            if(nums[i] == 0){
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                count++;
            }
        }
        return nums[len - 1] == 0 || nums[len - 2] == 0 ? -1 : count;
    }
}
