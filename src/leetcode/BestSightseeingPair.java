package leetcode;

/**
 * 1014. Best Sightseeing Pair
 */
public class BestSightseeingPair{
    public int maxScoreSightseeingPair(int[] values){
        int ret = 0;
        int prev = 0;
        for(int iter : values){
            ret = Math.max(ret, iter + prev);
            prev = Math.max(prev, iter) - 1;
        }
        return ret;
    }
}
