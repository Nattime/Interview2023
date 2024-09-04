package meta;

import java.util.Stack;

/**
 * A bracket is any of the following characters: (, ), {, }, [, or ].
 * We consider two brackets to be matching if the first bracket is an open-bracket, e.g., (, {, or [, and the second bracket is a close-bracket of the same type. That means ( and ), [ and ], and { and } are the only pairs of matching brackets.
 * Furthermore, a sequence of brackets is said to be balanced if the following conditions are met:
 * <p>
 * The sequence is empty, or
 * The sequence is composed of two or more non-empty sequences, all of which are balanced, or
 * The first and last brackets of the sequence are matching, and the portion of the sequence without the first and last elements is balanced.
 * <p>
 * You are given a string of brackets. Your task is to determine whether each sequence of brackets is balanced. If a string is balanced, return true, otherwise, return false
 */
public class BalanceBrackets{
    boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else if(ch == ']'){
                if(stack.empty() || stack.pop() != '['){
                    return false;
                }
            }else if(ch == '}'){
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            }else if(ch == ')'){
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
