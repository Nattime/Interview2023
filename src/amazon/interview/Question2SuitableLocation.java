package amazon.interview;

import java.util.List;

/*
 * Amazon has multiple delivery centers and delivery warehouses all over the world! The world is represented by a number
 * line from -10 pow 9 to 10 pow 9. There are n delivery centers, the ith one at location center[i]. A location x is called
 * a suitable location for a warehouse if it is possible to bring all the products to that point by traveling a distance
 * of no more than d. At any one time, products can be brought from one delivery center and placed at point x. Given the
 * positions of n delivery centers, calculate the number of suitable locations in the world. That is, calculate the number
 * of points x on the number line (-10 pow 9 ≤ x ≤ 10 pow 9) where the travel distance required to bring all the products
 * to that point is less than or equal to d.
 *
 * Note: The distance between point x and center[i] is |x - center[i]|, their absolute difference.
 */
public class Question2SuitableLocation{
    public int suitableLocation(List<Integer> center, long d){
        int lowest = -1_000_000_000;
        int highest = 1_000_000_000;
        boolean isTrue = false;
        int left = -1;
        while(lowest <= highest){
            int m = lowest + (highest - lowest) / 2;
            long dist = getDistance(center, m);
            long dist2 = getDistance(center, m + 1);
            if(dist <= d){
                isTrue = true;
                left = m;
                highest = m - 1;
            }else if(dist < dist2){
                highest = m - 1;
            }else{
                lowest = m + 1;
            }
        }
        if(!isTrue){
            return 0;
        }
        lowest = left;
        highest = 1_000_000_000;
        int right = -1;
        while(lowest <= highest){
            int m = lowest + (highest - lowest) / 2;
            long dist = getDistance(center, m);
            long dist2 = getDistance(center, m + 1);
            if(dist <= d){
                right = m;
                lowest = m + 1;
            }else if(dist < dist2){
                highest = m - 1;
            }else{
                lowest = m + 1;
            }
        }
        return right - left + 1;
    }

    public long getDistance(List<Integer> list, int mid){
        long total = 0;
        for(Integer integer : list){
            total += 2L * Math.abs((long)integer - (long)mid);
        }
        return total;
    }
}
