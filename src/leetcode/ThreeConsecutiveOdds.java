package leetcode;

/**
 * 1550. Three Consecutive Odds
 */
public class ThreeConsecutiveOdds{
    public boolean threeConsecutiveOdds(int[] arr){
        int count = 0;
        for(int iter : arr){
            if(iter % 2 == 1){
                count++;
            }else{
                count = 0;
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
}
