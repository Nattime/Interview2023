package leetcode;

import java.util.Arrays;

/**
 * 3016. Minimum Number of Pushes to Type Word II
 */
public class MinimumNumberOfPushesToTypeWordII{
    public int minimumPushes(String word){
        int[] count = new int[26];
        Arrays.fill(count, 0);
        int ret = 0;
        int len = word.length();
        for(int i = 0; i < len; ++i){
            int ind = word.charAt(i) - 'a';
            count[ind]++;
        }
        Arrays.sort(count);
        int c = 0;
        int div = 1;
        for(int i = 25; i >= 0; i--){
            if(c == 8){
                div++;
                c = 0;
            }
            ret += count[i] * div;
            c++;
        }
        return ret;
    }
}
