package leetcode;

import java.util.Stack;

/**
 * 402. Remove K Digits
 */
public class RemoveKDigits{
    public String removeKdigits(String num, int k){
        if(num.length() <= k){
            return "0";
        }
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < num.length(); ++i){
            while(k > 0 && !stack.isEmpty() && (stack.peek() > (num.charAt(i) - '0'))){
                stack.pop();
                --k;
            }
            stack.push(num.charAt(i) - '0');
        }
        while(k-- > 0){
            stack.pop();
        }
        for(int n : stack){
            if(n == 0 && str.isEmpty()){
                continue;
            }
            str.append(n);
        }
        return str.isEmpty() ? "0" : str.toString();
    }
}
