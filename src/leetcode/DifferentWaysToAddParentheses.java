package leetcode;

import java.util.*;

/**
 * 241. Different Ways to Add Parentheses
 */
public class DifferentWaysToAddParentheses{
    public List<Integer> diffWaysToCompute(String expression){
        return helper(expression, new HashMap<>());
    }

    private List<Integer> helper(String str, Map<String, List<Integer>> map){
        if(map.containsKey(str)){
            return map.get(str);
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!Character.isDigit(ch)){
                for(int a : helper(str.substring(0, i), map)){
                    for(int b : helper(str.substring(i + 1), map)){
                        if(ch == '+'){
                            ret.add(a + b);
                        }else if(ch == '-'){
                            ret.add(a - b);
                        }else{
                            ret.add(a * b);
                        }
                    }
                }
            }
        }
        if(ret.isEmpty()){
            map.put(str, List.of(Integer.parseInt(str)));
            return map.get(str);
        }
        map.put(str, ret);
        return ret;
    }
}
