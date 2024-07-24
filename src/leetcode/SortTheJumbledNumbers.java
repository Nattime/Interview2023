package leetcode;

import java.util.PriorityQueue;

/**
 * 2191. Sort the Jumbled Numbers
 */
public class SortTheJumbledNumbers{
    class Pair implements Comparable<Pair>{
        private final int num;
        private final int newNum;
        private final int ind;
        
        public Pair(int number, int convertedNumber, int index){
            num = number;
            newNum = convertedNumber;
            ind = index;
        }
        
        @Override
        public int compareTo(Pair o){
            return newNum == o.newNum ? ind - o.ind : newNum - o.newNum;
        }
    }
    
    public int[] sortJumbled(int[] mapping, int[] nums){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            int converted = 0;
            int div = 1;
            int temp = nums[i];
            if(temp == 0){
                pq.add(new Pair(nums[i], mapping[0], i));
            }else{
                while(temp > 0){
                    int n = temp % 10;
                    converted += mapping[n] * div;
                    div *= 10;
                    temp /= 10;
                }
                pq.add(new Pair(nums[i], converted, i));
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = pq.poll().num;
        }
        return nums;
    }
}
