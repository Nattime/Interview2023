package leetcode;

/**
 * 2554. Maximum Number of Integers to Choose From a Range I
 */
public class MaximumNumberOfIntegersToChooseFromARangeI{
    public int maxCount(int[] banned, int n, int maxSum){
        int[] arr = new int[10001];
        for(int iter : banned){
            arr[iter] = 1;
        }
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(arr[i] != 1){
                sum += i;
                if(sum > maxSum){
                    return count;
                }
                count++;
            }
        }
        return count;
    }
}
