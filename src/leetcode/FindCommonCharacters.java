package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 */
public class FindCommonCharacters{
    public List<String> commonChars(String[] words){
        int[] letterCount = new int[26];
        String w = words[0];
        for(int i = 0; i < w.length(); i++){
            int ind = w.charAt(i) - 'a';
            letterCount[ind]++;
        }
        
        for(String word : words){
            int[] count = new int[26];
            for(int i = 0; i < word.length(); i++){
                int ind = word.charAt(i) - 'a';
                count[ind]++;
            }
            for(int i = 0; i < 26; i++){
                letterCount[i] = Math.min(count[i], letterCount[i]);
            }
        }
        
        List<String> ret = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            if(letterCount[i] > 0){
                for(int j = 0; j < letterCount[i]; j++){
                    ret.add(String.valueOf((char)('a' + i)));
                }
            }
        }
        return ret;
    }
}
