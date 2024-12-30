package leetcode;

/**
 * 2466. Count Ways To Build Good Strings
 */
public class CountWaysToBuildGoodStrings{
    public int countGoodStrings(int low, int high, int zero, int one){
        final int maxi = 1_000_000_007;
        int ret = 0;
        int[] arr = new int[high + 1];
        arr[0] = 1;
        for(int i = 1; i <= high; i++){
            if(i >= zero){
                arr[i] = (arr[i] + arr[i - zero]) % maxi;
            }
            if(i >= one){
                arr[i] = (arr[i] + arr[i - one]) % maxi;
            }
            if(i >= low){
                ret = (ret + arr[i]) % maxi;
            }
        }
        return ret;
    }
}
