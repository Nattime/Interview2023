package leetcode;

/**
 * 1460. Make Two Arrays Equal by Reversing Subarrays
 */
public class MakeTwoArraysEqualByReversingSubarrays{
    public boolean canBeEqual(int[] target, int[] arr){
        int[] count = new int[1001];
        for(int i = 0; i < target.length; ++i){
            count[target[i]]++;
            count[arr[i]]--;
        }
        for(int iter : count){
            if(iter != 0){
                return false;
            }
        }
        return true;
    }
}
