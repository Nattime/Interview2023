package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139. Word Break
 */
public class WordBreak{
    public boolean wordBreak(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        int len = s.length();
        boolean[] hasBreak = new boolean[len + 1];
        hasBreak[0] = true;
        for(int i = 1; i <= len; ++i){
            for(int j = 0; j < i; ++j){
                if(hasBreak[j] && set.contains(s.substring(j, i))){
                    hasBreak[i] = true;
                    break;
                }
            }
        }
        return hasBreak[len];
    }
}
