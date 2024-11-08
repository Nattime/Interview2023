package leetcode;

/**
 * 1829. Maximum XOR for Each Query
 */
public class MaximumXORForEachQuery{
    public int[] getMaximumXor(int[] nums, int maximumBit){
        int val = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] ^= val;
            val = nums[i];
        }
        int e = (int)(Math.pow(2, maximumBit) - 1);
        for(int i = 0, j = nums.length - 1; i <= j; i++, j--){
            int temp = nums[i] ^ e;
            nums[i] = nums[j] ^ e;
            nums[j] = temp;
        }
        return nums;
    }
}
