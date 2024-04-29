package leetcode;

/**
 * 2997. Minimum Number of Operations to Make Array XOR Equal to K
 */
public class MinimumNumberOfOperationsToMakeArrayXOREqualToK{
    public int minOperations(int[] nums, int k){
        for(int iter : nums){
            k ^= iter;
        }
        return Integer.bitCount(k);
    }
}
