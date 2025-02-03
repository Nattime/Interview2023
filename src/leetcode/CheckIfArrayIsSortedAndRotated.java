package leetcode;

/**
 * 1752. Check if Array Is Sorted and Rotated
 */
public class CheckIfArrayIsSortedAndRotated{
    public boolean check(int[] nums){
        int len = nums.length;
        int ind = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                ind = i;
                break;
            }
        }
        for(int i = ind + 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                return false;
            }
        }
        return ind == 0 || ((nums[ind] <= nums[0]) && (nums[len - 1] <= nums[0])) || ((nums[ind - 1] >= nums[len - 1]) && (nums[0] >= nums[len - 1]));
    }
}
