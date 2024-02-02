package leetcode;

import java.util.Hashtable;

/**
 * 128. Longest Consecutive Sequence
 */
public class LongestConsecutiveSequence{
    public int longestConsecutive(int[] nums){
        int max = 0;
        Hashtable<Integer, Pair> map = new Hashtable<>();

        for(int iter : nums){
            int diff = 1;
            if(!map.containsKey(iter)){
                int begin = iter;
                int end = iter;
                if(map.containsKey(iter + 1)){
                    Pair p = map.get(iter + 1);
                    end = p.end;
                }
                if(map.containsKey(iter - 1)){
                    Pair p = map.get(iter - 1);
                    begin = p.start;
                }
                Pair p = new Pair(begin, end);
                if(begin != iter && end != iter){ // update both start and end
                    map.replace(begin, p);
                    map.replace(end, p);
                }else if(begin == iter && end != iter){ // update just -1
                    map.replace(end, p);
                }else if(begin != iter){ // update +1
                    map.replace(begin, p);
                }
                map.put(iter, p);
                diff = end - begin + 1;
            }
            max = Math.max(max, diff);
        }

        return max;
    }

    class Pair{
        Integer diff;
        Integer start;
        Integer end;

        Pair(Integer start, Integer end){
            this.start = start;
            this.end = end;
            diff = end - start + 1;
        }
    }
}
