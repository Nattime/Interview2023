package leetcode;

import java.util.Stack;

/**
 * 2696. Minimum String Length After Removing Substrings
 */
public class MinimumStringLengthAfterRemovingSubstrings{
    public int minLength(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'D'){
                if(!stack.empty() && stack.peek() == 'C'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else if(ch == 'B'){
                if(!stack.empty() && stack.peek() == 'A'){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
