package leetcode;

import java.util.Stack;

/**
 * 150 EvaluateReversePolishNotation
 */
public class EvaluateReversePolishNotation{
    public int evalRPN(String[] tokens){
        Stack<Integer> s = new Stack<>();
        for(String iter : tokens){
            if(iter.equals("*")){
                int x = s.pop();
                s.push((s.pop() * x));
            }else if(iter.equals("/")){
                int x = s.pop();
                s.push((s.pop() / x));
            }else if(iter.equals("+")){
                int x = s.pop();
                s.push((s.pop() + x));
            }else if(iter.equals("-")){
                int x = s.pop();
                s.push((s.pop() - x));
            }else{
                s.push(Integer.valueOf(iter));
            }
        }
        return s.pop();
    }
}
