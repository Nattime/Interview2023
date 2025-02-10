package leetcode;

import java.util.Stack;

/**
 * 3174. Clear Digits
 */
public class ClearDigits{
    public String clearDigits(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                if(Character.isAlphabetic(stack.peek())){
                    stack.pop();
                }else{
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        StringBuilder ret = new StringBuilder();
        for(char ch : stack){
            ret.append(ch);
        }
        return ret.toString();
    }
}
