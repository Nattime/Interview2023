package codesignal;

import java.util.Stack;

public class ReverseInParentheses{
    String solution(String inputString){
        char[] arr = inputString.toCharArray();
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < inputString.length(); i++){
            char ch = inputString.charAt(i);
            if(ch == '('){
                arr[i] = ' ';
                stack.push(i);
            }else if(ch == ')'){
                arr[i] = ' ';
                for(int l = stack.pop(), r = i - 1; l < r; l++, r--){
                    char temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                }
            }
        }
        for(char iter : arr){
            if(iter != ' '){
                str.append(iter);
            }
        }
        return str.toString();
    }
}
