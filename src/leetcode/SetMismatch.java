package leetcode;

/**
 * 645. Set Mismatch
 */
public class SetMismatch{
    public int[] findErrorNums(int[] nums){
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i]);
            if(nums[num - 1] < 0){
                arr[0] = num;
            }else{
                nums[num - 1] *= -1;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                arr[1] = i + 1;
                break;
            }
        }

        return arr;
    }
}
