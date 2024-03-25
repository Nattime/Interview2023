package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array
 */
public class FindAllDuplicatesInAnArray{
    public List<Integer> findDuplicates(int[] nums){
        List<Integer> ret = new ArrayList<>();

        for(int iter : nums){
            int num = iter < 0 ? iter * -1 : iter;
            if(nums[num - 1] >= 0){
                nums[num - 1] *= -1;
            }else{
                ret.add((num));
            }
        }

        return ret;
    }
}
