package leetcode;

/**
 * 2486. Append Characters to String to Make Subsequence
 */
public class AppendCharactersToStringToMakeSubsequence{
    public int appendCharacters(String s, String t){
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == t.charAt(index)){
                if(++index == t.length()){
                    return 0;
                }
            }
        }
        return t.length() - index;
    }
}
