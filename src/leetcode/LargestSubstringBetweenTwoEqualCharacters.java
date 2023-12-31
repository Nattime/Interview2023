package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenTwoEqualCharacters{
    public int maxLengthBetweenEqualCharacters(String s){
        // with array
        int ret = -1;

        int arr[] = new int[26];
        Arrays.setAll(arr, iter -> -1);
        for(int i = 0; i < s.length(); i++){
            int val = s.charAt(i) - 'a';
            if(arr[val] != -1){
                ret = Math.max((i - arr[val] - 1), ret);
            }else{
                arr[val] = i;
            }
        }

        return ret;

        // with map
//        int ret = -1;
//
//        Map<Character, Integer> map = new HashMap<>();
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){
//                int diff = i - map.get(ch) - 1;
//                if(diff > ret){
//                    ret = diff;
//                }
//            }else{
//                map.put(ch, i);
//            }
//        }
//
//        return ret;
    }
}
