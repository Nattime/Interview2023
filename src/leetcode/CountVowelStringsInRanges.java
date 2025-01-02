package leetcode;

/**
 * 2559. Count Vowel Strings in Ranges
 */
public class CountVowelStringsInRanges{
    public int[] vowelStrings(String[] words, int[][] queries){
        int[] arr = new int[words.length + 2];
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))){
                count++;
            }
            arr[i + 1] = count;
        }
        int[] ret = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            ret[i] = (arr[queries[i][1] + 1] - arr[queries[i][0]]);
        }
        return ret;
    }

    private boolean isVowel(char ch){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char iter : vowels){
            if(ch == iter){
                return true;
            }
        }
        return false;
    }
}
