package meta.interview.coding241015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Coding Question 2 10/15/24
 * Create a subclass methods:
 *      insert: inserts number
 *      getMedium: returns the medium from the list of numbers
 * EX:
 *      insert numbers 3, 1, 2 and when getMedium returns 2
 *      insert numbers 7, 2, 4, 3 and getMedium returns 3.5
 *
 */
public class Question2GetMedium{
    List<Integer> list;

    public Question2GetMedium(){
        list = new ArrayList<>();
    }

    public void insert(int num){
        list.add(num);
    }

    public double getMedium() throws Exception{
        // if no numbers are in data structure, throw an error
        if(list.isEmpty()){
            throw new Exception();
        }
        Collections.sort(list);
        int size = list.size();
        if(size % 2 == 1){
            return (double)list.get(size / 2);
        }else{
            return ((double)list.get(size / 2) + (double)list.get((size / 2) - 1)) / 2;
        }
    }
}
