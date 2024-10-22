package meta.interview.coding241015;

import java.util.Random;

/**
 * 10/16/24
 * Meta day 2 coding question 5
 * Given the cities and population, return a city that has the same ratio returns
 * {
 * "NYC" : 700000001,
 * "LA" : 500000000,
 * "SEATTLE" : 800000000
 * }
 * return the cities in proportion to their size when called number of times
 */
public class Question5Cities{
    String getCity(String[] cities, long[] pop){
        long totalPop = pop[0];
        int ind = 1;
        long[][] percentage = new long[cities.length][];
        percentage[0] = new long[]{1, pop[0]};
        for(; ind < pop.length; ind++){
            percentage[ind] = new long[2];
            totalPop += 1;
            percentage[ind][0] = totalPop;
            totalPop += pop[ind];
            percentage[ind][1] = totalPop;
        }
        Random rd = new Random();
        long val = rd.nextLong(1L, totalPop);
        ind = 0;
        for(long[] iter : percentage){
            if(iter[0] <= val && iter[1] >= val){
                return cities[ind];
            }
            ind++;
        }
        return null;
    }
}
