package leetcode;

import java.util.*;

/**
 * 632. Smallest Range Covering Elements from K Lists
 */
public class SmallestRangeCoveringElementsFromKLists{
    public int[] smallestRange(List<List<Integer>> nums){
        int size = 0;
        for(List<Integer> iter : nums){
            size += iter.size();
        }
        int[][] mat = new int[size][2];
        int ind = 0;
        for(int i = 0; i < nums.size(); i++){
            List<Integer> list = nums.get(i);
            for(int iter : list){
                mat[ind][0] = iter;
                mat[ind++][1] = i;
            }
        }
        Arrays.sort(mat, Comparator.comparingInt(a->a[0]));
        Map<Integer, Integer> count = new HashMap<>();
        int[] ret = new int[]{-1_000_000, 1_000_000};
        int first = 0;
        for(int[] iter : mat){
            int last = iter[0];
            int listInd = iter[1];
            count.put(listInd, count.getOrDefault(listInd, 0) + 1);
            while(count.size() == nums.size()){
                int startVal = mat[first][0];
                int startInd = mat[first][1];
                int diff = last - startVal - (ret[1] - ret[0]);
                if(diff < 0 || (diff == 0 && startVal < ret[0])){
                    ret[0] = startVal;
                    ret[1] = last;
                }
                count.put(startInd, count.get(startInd) - 1);
                if(count.get(startInd) == 0){
                    count.remove(startInd);
                }
                first++;
            }
        }
        return ret;
    }
}
