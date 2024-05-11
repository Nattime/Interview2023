package leetcode;

import java.util.PriorityQueue;

/**
 * 786. K-th Smallest Prime Fraction
 */
public class KthSmallestPrimeFraction{
    public int[] kthSmallestPrimeFraction(int[] arr, int k){
        int len = arr.length;
        PriorityQueue<int[]> q = new PriorityQueue<>((first, second)->{
            double f = (double)first[0] / first[1];
            double s = (double)second[0] / second[1];
            return f < s ? 1 : -1;
        });
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                q.offer(new int[]{arr[i], arr[j]});
                if(q.size() > k){
                    q.poll();
                }
            }
        }
        return q.poll();
    }
}
