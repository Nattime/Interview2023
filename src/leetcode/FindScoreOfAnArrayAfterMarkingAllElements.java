package leetcode;

/**
 * 2593. Find Score of an Array After Marking All Elements
 */
public class FindScoreOfAnArrayAfterMarkingAllElements{
    public long findScore(int[] nums){
        long ret = 0;
        final int len = nums.length;
        final int MAX = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++){
            int left = i > 0 ? nums[i - 1] : MAX;
            int right = i < len - 1 ? nums[i + 1] : MAX;
            if(nums[i] < left && nums[i] <= right){
                ret += nums[i];
                nums[i] = MAX;
                if(i > 0) nums[i - 1] = MAX;
                if(i < len - 1) nums[i + 1] = MAX;
                i += 1;
            }
        }
        for(int i = len - 1; i >= 0; i--){
            int left = i > 0 ? nums[i - 1] : MAX;
            int right = i < len - 1 ? nums[i + 1] : MAX;
            if(nums[i] < left && nums[i] <= right){
                ret += nums[i];
                if(i > 0) nums[i - 1] = MAX;
                i -= 1;
            }
        }
        return ret;
    }
}
