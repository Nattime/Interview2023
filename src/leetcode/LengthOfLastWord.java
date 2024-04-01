package leetcode;

/**
 * 58. Length of Last Word
 */
public class LengthOfLastWord{
    public int lengthOfLastWord(String s){
        int start = s.length() - 1;
        while(s.charAt(start) == ' '){
            start--;
        }
        for(int i = start; i >= 0; i--){
            if(s.charAt(i) == ' '){
                return start - i;
            }
        }
        return start + 1;
    }
}
