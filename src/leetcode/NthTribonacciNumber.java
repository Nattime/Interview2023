package leetcode;

/**
 * 1137. N-th Tribonacci Number
 */
public class NthTribonacciNumber{
    public int tribonacci(int n){
        if(n == 0){
            return 0;
        }
        int[] arr = new int[]{0, 1, 1, 2};
        int prevIndex = 0;
        int index = 3;
        for(int i = 2; i < n; i++){
            int sum = arr[index] - arr[prevIndex];
            int num = arr[index];
            index = (index + 1) % 4;
            prevIndex = (prevIndex + 1) % 4;
            arr[index] = sum + num;
        }
        return arr[(index + 3) % 4];
    }
}
