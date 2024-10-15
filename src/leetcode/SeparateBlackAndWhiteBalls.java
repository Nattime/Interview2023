package leetcode;

/**
 * 2938. Separate Black and White Balls
 */
public class SeparateBlackAndWhiteBalls{
    public long minimumSteps(String s){
        long ret = 0L;
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if(lChar == '1' && rChar == '0'){
                ret += (r - l);
                l++;
                r--;
            }else if(lChar == '1'){
                r--;
            }else if(rChar == '0'){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return ret;
    }
}
