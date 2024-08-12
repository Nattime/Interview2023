package leetcode;

import java.util.PriorityQueue;

/**
 * 703. Kth Largest Element in a Stream
 */
public class KthLargestElementInAStream{
    int kth;
    PriorityQueue<Integer> pq;

    public KthLargestElementInAStream(int k, int[] nums){
        kth = k;
        pq = new PriorityQueue<>((a, b)->{
            return a - b;
        });
        for(int i : nums){
            if(pq.size() < kth){
                pq.add(i);
            }else{
                int num = pq.peek();
                if(num < i){
                    pq.poll();
                    pq.add(i);
                }
            }
        }
    }

    public int add(int val){
        if(pq.size() < kth){
            pq.add(val);
        }else{
            int num = pq.peek();
            if(num < val){
                pq.poll();
                pq.add(val);
            }
        }
        return pq.peek();
    }
}
