package leetcode;

import java.util.Arrays;

/**
 * 1657. Determine if Two Strings Are Close
 */
public class DetermineIfTwoStringsAreClose{
    public boolean closeStrings(String word1, String word2){
        if(word2.length() != word1.length()){
            return false;
        }
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for(int i = 0; i < word1.length(); i++){
            int ind1 = (word1.charAt(i) - 'a');
            int ind2 = (word2.charAt(i) - 'a');
            count1[ind1]++;
            count2[ind2]++;
        }
        for(int i = 0; i < 26; i++){
            if((count1[i] > 0 && count2[i] == 0) || (count1[i] == 0 && count2[i] > 0)){
                return false;
            }
        }
        Arrays.sort(count1);
        Arrays.sort(count2);
        for(int i = 0; i < 26; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        }
        return true;
    }
}
