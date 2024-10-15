package meta.interview.coding241015;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Coding Interview 10/15/24
 * Find the max number and return the index of the max number, if it has more than one max number, return one of the
 * index randomly
 * ex: [2, 1, -1, 6, 0, 6]
 *                ^     ^
 *                |     |
 *                3     5
 * can either return index 3 or 5, with equal chance of returning either number
 */
public class Question1FindMaxNumberIndex{
    public int findMaxIndex(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int maxNum = Integer.MIN_VALUE;
        for(int iter : arr){
            maxNum = Math.max(maxNum, iter);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == maxNum){
                list.add(i);
            }
        }
        Random rand = new Random();
        return list.get(rand.nextInt(0, list.size()));
    }
}
