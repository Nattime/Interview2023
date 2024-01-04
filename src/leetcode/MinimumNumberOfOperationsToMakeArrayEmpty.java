package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeArrayEmpty{
    public int minOperations(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        for(int iter : nums){
            map.put(iter, map.getOrDefault(iter, 0) + 1);
        }

        int count = 0;
        for(Map.Entry<Integer, Integer> iter : map.entrySet()){
            int c = iter.getValue();

            if(c == 1){
                return -1;
            }

            count += c / 3;

            if(c % 3 != 0){
                count++;
            }
        }

        return count;
    }
}
