package leetcode;

/**
 * 1381. Design a Stack With Increment Operation
 */


/*
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
public class DesignAStackWithIncrementOperation{
    static class CustomStack{
        private final int[] stack;
        private int topInd;
        private final int maxSize;

        public CustomStack(int maxSize){
            this.maxSize = maxSize;
            topInd = -1;
            stack = new int[maxSize];
        }

        public void push(int x){
            if(topInd + 1 < maxSize){
                stack[++topInd] = x;
            }
        }

        public int pop(){
            if(topInd > -1){
                return stack[topInd--];
            }
            return -1;
        }

        public void increment(int k, int val){
            if(topInd > -1){
                int len = Math.min(k, topInd + 1);
                for(int i = 0; i < len; i++){
                    stack[i] += val;
                }
            }
        }
    }
}
