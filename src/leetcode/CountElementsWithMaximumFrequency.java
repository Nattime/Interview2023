package leetcode;

/**
 * 3005. Count Elements With Maximum Frequency
 */
public class CountElementsWithMaximumFrequency{
    public int maxFrequencyElements(int[] nums){
        int maxFreq = 0;
        int[] count = new int[101];
        for(int iter : nums){
            int c = count[iter] + 1;
            count[iter]++;
            if(c > maxFreq){
                maxFreq = c;
            }
        }
        int total = 0;
        for(int i = 1; i < 101; i++){
            if(count[i] == maxFreq){
                total += maxFreq;
            }
        }
        return total;
    }
}
