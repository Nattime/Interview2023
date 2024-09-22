package ukg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    interview: 9/19/24 hackerrank ukg

    print all the lowest difference between two cells in increasing order pairs

    eg1:
        {-7, 3, 6, 0}
        0 3
        3 6


    eg2:
        {2, 6, 4, 0, -3, 8}
        0 2
        2 4
        4 6
        6 8
 */
public class PrintLowestDifference{
    public void printLowestPair(List<Integer> arr){
        Collections.sort(arr);
        int min = Math.abs(arr.get(0) - arr.get(1));
        List<String> list = new ArrayList<>();
        for(int i = 1; i < arr.size(); i++){
            int prev = arr.get(i - 1);
            int curr = arr.get(i);
            int diff = Math.abs(prev - curr);
            if(diff == min){
                list.add(prev + " " + curr);
            }else if(diff < min){
                list = new ArrayList<>();
                min = diff;
                list.add(prev + " " + curr);
            }
        }
        for(String iter : list){
            System.out.println(iter);
        }
    }
}
