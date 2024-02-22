package leetcode;

/**
 * 997. Find the Town Judge
 */
public class FindTheTownJudge{
    public int findJudge(int n, int[][] trust){
        int[] truster = new int[n];
        int[] trustee = new int[n];
        for(int[] nums : trust){
            truster[nums[0] - 1]++;
            trustee[nums[1] - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(truster[i] == 0 && trustee[i] == (n - 1)){
                return i + 1;
            }
        }
        return -1;
    }
}
