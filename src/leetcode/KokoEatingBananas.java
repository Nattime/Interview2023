package leetcode;

/**
 * 875. Koko Eating Bananas
 */
public class KokoEatingBananas{
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int max = 0;
        for(int iter : piles){
            max = Math.max(iter, max);
        }

        while(l < max){
            int m = l + ((max - l) >> 1);
            int sum = 0;
            for(int iter : piles){
                sum += (iter + m - 1) / m;
            }
            if(sum > h){
                l = m + 1;
            }else{
                max = m;
            }
        }
        return l;
    }
}
