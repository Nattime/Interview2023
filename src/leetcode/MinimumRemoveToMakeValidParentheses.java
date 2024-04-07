package leetcode;

import java.util.Stack;

/**
 * 1249. Minimum Remove to Make Valid Parentheses
 */
public class MinimumRemoveToMakeValidParentheses{
    public String minRemoveToMakeValid(String s){
        char[] arr = new char[s.length()];
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            arr[i] = ch;
            if(ch == '('){
                stack.push(i);
            }else if(ch == ')' && !stack.empty()){
                stack.pop();
            }else if(ch == ')'){
                arr[i] = ' ';
            }
        }
        while(!stack.empty()){
            arr[stack.pop()] = ' ';
        }
        for(int i = 0; i < s.length(); i++){
            if(arr[i] != ' '){
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
