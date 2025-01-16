package flextrade.interview.jan1125;

import java.util.Collections;
import java.util.List;

/**
 * hackerrank 01/11/25
 * 6. Piles Of Boxes
 * Alex has n piles of boxes with varying heights. In each step, Alex can remove any number of boxes from the tallest pile
 * to reduce its height to match the next tallest pile. Determine the minimum number of steps required to make all piles
 * equal in height.
 * Example
 * n = 3
 * boxesinPiles = [5, 2, 1 ]
 */
public class Question1{
    long pilesOfBoxes(List<Integer> boxesInPiles){
        int size = boxesInPiles.size();
        if(size < 2){
            return 0L;
        }
        Collections.sort(boxesInPiles);
        long sum = 0L;
        for(int i = 1; i < size; ++i){
            if(!boxesInPiles.get(size - i - 1).equals(boxesInPiles.get(size - i))){
                sum += i;
            }
        }
        return sum;
    }
}
