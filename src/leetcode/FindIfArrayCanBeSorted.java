package leetcode;

/**
 * 3011. Find if Array Can Be Sorted
 */
public class FindIfArrayCanBeSorted{
    public boolean canSortArray(int[] nums){
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int prev = nums[i - 1];
            if(curr < prev){
                if(Integer.bitCount(curr) == Integer.bitCount(prev)){
                    nums[i] = prev;
                    nums[i - 1] = curr;
                }else{
                    return false;
                }
            }
        }
        for(int i = nums.length - 1; i > 0; i--){
            int curr = nums[i];
            int prev = nums[i - 1];
            if(curr < prev){
                if(Integer.bitCount(curr) == Integer.bitCount(prev)){
                    nums[i] = prev;
                    nums[i - 1] = curr;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
