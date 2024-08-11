package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 1636. Sort Array by Increasing Frequency
 */
public class SortArrayByIncreasingFrequency{
    class Pair implements Comparable<Pair>{
        public int count;
        public int num;

        public Pair(int n, int c){
            num = n;
            count = c;
        }

        @Override
        public int compareTo(Pair o){
            return count == o.count ? o.num - num : (count - o.count);
        }
    }

    public int[] frequencySort(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(Map.Entry<Integer, Integer> iter : map.entrySet()){
            pq.add(new Pair(iter.getKey(), iter.getValue()));
        }
        int i = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int n = p.num;
            for(int j = p.count; j > 0; --j){
                nums[i++] = n;
            }
        }
        return nums;
    }
}
