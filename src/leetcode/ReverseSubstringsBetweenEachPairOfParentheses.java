package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 1190. Reverse Substrings Between Each Pair of Parentheses
 */
public class ReverseSubstringsBetweenEachPairOfParentheses{
    public String reverseParentheses(String s){
        StringBuilder str = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                queue.push(i);
            }else if(s.charAt(i) == ')'){
                final int j = queue.pop();
                map.put(i, j);
                map.put(j, i);
            }
        }
        for(int l = 0, m = 1; l < s.length(); l += m){
            if(s.charAt(l) == '(' || s.charAt(l) == ')'){
                l = map.get(l);
                m = -m;
            }else{
                str.append(s.charAt(l));
            }
        }
        return str.toString();
    }
}
