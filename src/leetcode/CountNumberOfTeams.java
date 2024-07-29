package leetcode;

/**
 * 1395. Count Number of Teams
 */
public class CountNumberOfTeams{
    public int numTeams(int[] rating){
        int ret = 0;
        int len = rating.length;
        for(int i = 1; i < len - 1; ++i){
            int num = rating[i];
            int lGreater = 0;
            int lLesser = 0;
            for(int j = i - 1; j >= 0; --j){
                if(rating[j] < num){
                    lLesser++;
                }
                if(rating[j] > num){
                    lGreater++;
                }
            }
            int rGreater = 0;
            int rLesser = 0;
            for(int j = i + 1; j < len; ++j){
                if(rating[j] < num){
                    rLesser++;
                }
                if(rating[j] > num){
                    rGreater++;
                }
            }
            ret += (lLesser * rGreater) + (rLesser * lGreater);
        }
        return ret;
    }
}
