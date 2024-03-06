package leetcode;

/**
 * 1750. Minimum Length of String After Deleting Similar Ends
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds{
    public int minimumLength(String s){
        int begin = 0;
        int end = s.length() - 1;
        while(begin < end){
            char c = s.charAt(begin);
            if(s.charAt(end) != c){
                break;
            }
            for(; begin < end; begin++){
                if(s.charAt(begin) != c){
                    break;
                }
            }
            for(; end >= begin; end--){
                if(s.charAt(end) != c){
                    break;
                }
            }
        }
        return end < begin ? 0 : (end - begin) + 1;
    }
}
