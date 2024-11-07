package leetcode;

/**
 * 2275. Largest Combination With Bitwise AND Greater Than Zero
 */
public class LargestCombinationWithBitwiseANDGreaterThanZero{
    public int largestCombination(int[] candidates){
        int ret = 0;
        for(int i = 0; i < 24; i++){
            int count = 0;
            for(int iter : candidates){
                if((iter & (1 << i)) != 0){
                    count++;
                }
            }
            ret = Math.max(ret, count);
        }
        return ret;
    }
}
