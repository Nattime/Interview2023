package leetcode;

/**
 * 2461. Maximum Sum of Distinct Subarrays With Length K
 */
public class MaximumSumOfDistinctSubarraysWithLengthK{
    public long maximumSubarraySum(int[] nums, int k){
        int[] count = new int[100_001];
        long sum = 0;
        int nonDistinctCount = 0;
        for(int i = 0; i < k; i++){
            if(count[nums[i]] != 0){
                nonDistinctCount++;
            }
            sum += nums[i];
            count[nums[i]]++;
        }
        long max = 0;
        if(nonDistinctCount == 0){
            max = sum;
        }
        for(int i = k; i < nums.length; i++){
            int j = i - k;
            if(count[nums[j]] > 1){
                nonDistinctCount--;
            }
            count[nums[j]]--;
            sum -= nums[j];
            if(count[nums[i]] > 0){
                nonDistinctCount++;
            }
            count[nums[i]]++;
            sum += nums[i];
            if(nonDistinctCount == 0){
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
