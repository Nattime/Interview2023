package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 525. Contiguous Array
 */
public class ContiguousArray{
    public int findMaxLength(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int dis = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num == 0){
                sum -= 1;
            }else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                dis = Math.max(i - map.get(sum), dis);
            }else{
                map.put(sum, i);
            }
        }
        return dis;
    }
}
