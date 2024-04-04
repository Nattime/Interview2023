package leetcode;

/**
 * 1614. Maximum Nesting Depth of the Parentheses
 */
public class MaximumNestingDepthOfTheParentheses{
    public int maxDepth(String s){
        int count = 0;
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }else if(s.charAt(i) == ')'){
                max = Math.max(count, max);
                count--;
            }
        }

        return max;
    }
}
