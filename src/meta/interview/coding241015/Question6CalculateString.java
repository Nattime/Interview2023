package meta.interview.coding241015;

/**
 * 10/16/24
 * Meta day 2 coding question 6
 * Given a string of numbers and only operators + and *, return the sum
 * eg:
 * "2*3+4" = "10"
 */
public class Question6CalculateString{
    public String compute(String str){
        String[] plus = str.split("\\+");
        long sum = 0L;
        for(String iter : plus){
            String[] multiply = iter.split("\\*");
            long total = 1L;
            for(String num : multiply){
                total *= Long.parseLong(num);
            }
            sum += total;
        }
        return sum + "";
    }
}
