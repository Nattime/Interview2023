package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 */
public class MajorityElement{
    public int majorityElement(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        for(int iter : nums){
            if(map.containsKey(iter)){
                int val = map.get(iter) + 1;
                if(val >= ((nums.length / 2) + 1)){
                    max = iter;
                    break;
                }
                map.replace(iter, val);
            }else{
                map.put(iter, 1);
            }
        }
        return max;
    }
}
