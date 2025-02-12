package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 2342. Max Sum of a Pair With Equal Sum of Digits
 */
public class MaxSumOfAPairWithEqualSumOfDigits{
    public int maximumSum(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        int ret = -1;
        for(int iter : nums){
            int sum = 0;
            int num = iter;
            while(num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(map.containsKey(sum)){
                int val = map.get(sum);
                ret = Math.max(ret, val + iter);
                if(val < iter){
                    map.replace(sum, iter);
                }
            }else{
                map.put(sum, iter);
            }
        }
        return ret;
    }
}
