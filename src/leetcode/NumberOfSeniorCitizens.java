package leetcode;

/**
 * 2678. Number of Senior Citizens
 */
public class NumberOfSeniorCitizens{
    public int countSeniors(String[] details){
        int count = 0;
        for(String iter : details){
            int age = Integer.parseInt(iter.substring(11, 13));
            if(age > 60){
                count++;
            }
        }
        return count;
    }
}
