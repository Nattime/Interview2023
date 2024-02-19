package leetcode;

/**
 * 231. Power of Two
 */
public class PowerOfTwo{
    public boolean isPowerOfTwo(int n){
        while(n != 1){
            if(n == 0){
                return false;
            }
            if(n % 2 == 0){
                n /= 2;
            }else{
                return false;
            }
        }
        return true;
    }
}
