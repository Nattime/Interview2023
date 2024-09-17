package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 884. Uncommon Words from Two Sentences
 */
public class UncommonWordsFromTwoSentences{
    public String[] uncommonFromSentences(String s1, String s2){
        Map<String, Integer> map = new HashMap<>();
        int len = 0;
        String[] s1Arr = s1.split(" ");
        for(String iter : s1Arr){
            Integer count = map.get(iter);
            if(count == null){
                map.put(iter, 1);
                len++;
            }else{
                if(count == 1){
                    len--;
                }
                map.replace(iter, count + 1);
            }
        }
        String[] s2Arr = s2.split(" ");
        for(String iter : s2Arr){
            Integer count = map.get(iter);
            if(count == null){
                map.put(iter, 1);
                len++;
            }else{
                if(count == 1){
                    len--;
                }
                map.replace(iter, count + 1);
            }
        }
        String[] ret = new String[len];
        int ind = 0;
        for(Map.Entry<String, Integer> iter : map.entrySet()){
            if(iter.getValue() == 1){
                ret[ind++] = iter.getKey();
            }
        }
        return ret;
    }
}
