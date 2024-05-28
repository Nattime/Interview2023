package leetcode;

/**
 * 1208. Get Equal Substrings Within Budget
 */
public class GetEqualSubstringsWithinBudget{
    public int equalSubstring(String s, String t, int maxCost){
        int len = s.length();
        int start = 0;
        int diff = 0;
        int ret = 0;
        for(int iter = 0; iter < len; iter++){
            diff += Math.abs(s.charAt(iter) - t.charAt(iter));
            while(maxCost < diff){
                diff -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            ret = Math.max(iter - start + 1, ret);
        }
        return ret;
    }
}
