package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 */
public class LexicographicalNumbers{
    public List<Integer> lexicalOrder(int n){
        List<Integer> ret = new ArrayList<>();
        int curr = 1;
        for(int i = 0; i < n; i++){
            ret.add(curr);
            if(curr * 10 <= n){
                curr *= 10;
            }else{
                while(curr % 10 == 9 || curr + 1 > n){
                    curr /= 10;
                }
                curr++;
            }
        }
        return ret;
    }
}
