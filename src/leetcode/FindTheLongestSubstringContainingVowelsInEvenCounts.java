package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1371. Find the Longest Substring Containing Vowels in Even Counts
 */
public class FindTheLongestSubstringContainingVowelsInEvenCounts{
    public int findTheLongestSubstring(String s){
        String vowels = "aeiou";
        int bit = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < s.length(); i++){
            int index = vowels.indexOf(s.charAt(i));
            if(index != -1){
                bit ^= 1 << index;
            }
            map.putIfAbsent(bit, i);
            count = Math.max(count, i - map.get(bit));
        }
        return count;
    }
}
