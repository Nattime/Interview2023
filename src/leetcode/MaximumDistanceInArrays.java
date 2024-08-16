package leetcode;

import java.util.List;

/**
 * 624. Maximum Distance in Arrays
 */
public class MaximumDistanceInArrays{
    public int maxDistance(List<List<Integer>> arrays){
        int ret = 0;
        int min = 10_000;
        int max = -10_000;
        for(List<Integer> iter : arrays){
            int size = iter.size();
            ret = Math.max(ret, Math.max(iter.get(size - 1) - min, max - iter.get(0)));
            min = Math.min(min, iter.get(0));
            max = Math.max(max, iter.get(size - 1));
        }
        return ret;
    }
}
