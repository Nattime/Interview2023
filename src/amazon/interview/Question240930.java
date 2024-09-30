package amazon.interview;

import java.util.List;

/**
 * Date: 9/30/24
 */
public class Question240930{
    /*
    You are given an array of stock prices per day, each day you can do at max 1 operation, buy or sell 1 stock.
    Maximize the profit from the array.
     */
    int solution(List<Integer> arr){
        int ret = 0;
        int len = arr.size();
        int[] sorted = arr.stream().mapToInt(i->i).sorted().toArray();
        for(int i = 0; i < len; i++){
            for(int j = len - 1; j > i; j--){
                if(sorted[i] != -1 && (sorted[j] != -1 && arr.lastIndexOf(sorted[j]) > arr.lastIndexOf(sorted[i]))){
                    ret += sorted[j] - sorted[i];
                    sorted[j] = -1;
                    break;
                }
            }
        }
        return ret;
    }
}
