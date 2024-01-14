package leetcode;

import java.util.Stack;

/**
 * 155. Min Stack
 * * Your MinStack object will be instantiated and called as such:
 * * MinStack obj = new MinStack();
 * * obj.push(val);
 * * obj.pop();
 * * int param_3 = obj.top();
 * * int param_4 = obj.getMin();
 */
public class MinStack{
    Stack<Pair> st;

    public MinStack(){
        st = new Stack<>();
    }

    public void push(int val){
        if(st.empty()){
            st.push(new Pair(val, val));
        }else{
            int min = Math.min(st.peek().min, val);
            st.push(new Pair(val, min));
        }
    }

    public void pop(){
        st.pop();
    }

    public int top(){
        return st.peek().val;
    }

    public int getMin(){
        if(st.empty()){
            return 0;
        }else{
            return st.peek().min;
        }
    }
}

class Pair{
    int val;
    int min;

    Pair(int val, int min){
        this.val = val;
        this.min = min;
    }
}