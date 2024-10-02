package leetcode;

import java.util.*;

/**
 * 1331. Rank Transform of an Array
 */
public class RankTransformOfAnArray{
    public int[] arrayRankTransform(int[] arr){
        Map<Integer, Integer> sortedMap = new HashMap<>();
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int ind = 1;
        int prev = Integer.MIN_VALUE;
        for(int j : sorted){
            if(j == prev){
                continue;
            }
            sortedMap.put(j, ind++);
            prev = j;
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = sortedMap.get(arr[i]);
        }
        return arr;
    }
}
