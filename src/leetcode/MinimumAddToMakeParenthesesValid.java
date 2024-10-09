package leetcode;

/**
 * 921. Minimum Add to Make Parentheses Valid
 */
public class MinimumAddToMakeParenthesesValid{
    public int minAddToMakeValid(String s){
        int left = 0;
        int right = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                left++;
            }else{
                if(left > 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        return left + right;
    }
}
