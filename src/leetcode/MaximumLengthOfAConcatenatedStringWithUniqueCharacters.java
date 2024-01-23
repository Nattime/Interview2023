package leetcode;

import java.util.*;

/**
 * 1239. Maximum Length of a Concatenated String with Unique Characters
 */
public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters{
    public int maxLength(List<String> arr){
        int max = 0;
        return helper(arr, 0, 0, max);
    }

    private int helper(List<String> arr, int index, int charSet, int max){
        if(index == arr.size()){
            int count = 0;
            for(int i = 0; i < 26; ++i){
                if((charSet & (1 << i)) != 0){
                    count++;
                }
            }

            return Math.max(max, count);
        }

        int newCharSet = charSet;
        boolean isValidString = true;

        for(char ch : arr.get(index).toCharArray()){
            int bit = 1 << (ch - 'a');
            if((newCharSet & bit) == 0){
                newCharSet |= bit;
            }else{
                isValidString = false;
                break;
            }
        }

        if(isValidString){
            max = helper(arr, index + 1, newCharSet, max);
        }

        return helper(arr, index + 1, charSet, max);
    }
}
