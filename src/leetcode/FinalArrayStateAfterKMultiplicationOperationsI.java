package leetcode;

/**
 * 3264. Final Array State After K Multiplication Operations I
 */
public class FinalArrayStateAfterKMultiplicationOperationsI{
    public int[] getFinalState(int[] nums, int k, int multiplier){
        for(int i = 0; i < k; i++){
            int min = nums[0];
            int ind = 0;
            for(int j = 1; j < nums.length; j++){
                if(min > nums[j]){
                    min = nums[j];
                    ind = j;
                }
            }
            nums[ind] = min * multiplier;
        }
        return nums;
    }
}
