package leetcode;

/**
 * 70. Climbing Stairs
 */
public class ClimbingStairs{
    public int climbStairs(int n){
        if(n == 1){
            return 1;
        }
        int total = 2;
        int prev = 1;
        int temp = 2;
        for(int i = 2; i < n; i++){
            temp = total;
            total += prev;
            prev = temp;
        }
        return total;
    }
}
