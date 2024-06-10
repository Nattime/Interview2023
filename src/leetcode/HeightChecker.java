package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1051. Height Checker
 */
public class HeightChecker{
    public int heightChecker(int[] heights){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.naturalOrder());
        for(int height : heights){
            pq.add(height);
        }
        int count = 0;
        int i = 0;
        while(!pq.isEmpty()){
            if(pq.poll() != heights[i++]){
                count++;
            }
        }
        return count;
    }
}
