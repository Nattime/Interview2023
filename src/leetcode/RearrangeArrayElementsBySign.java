package leetcode;

/**
 * 2149. Rearrange Array Elements by Sign
 */
public class RearrangeArrayElementsBySign{
    public int[] rearrangeArray(int[] nums) {
        int[] ret = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for(int iter : nums){
            if(iter < 0){
                ret[neg] = iter;
                neg += 2;
            }else{
                ret[pos] = iter;
                pos += 2;
            }
        }

        return ret;
    }
}
