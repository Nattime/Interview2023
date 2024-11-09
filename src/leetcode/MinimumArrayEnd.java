package leetcode;

/**
 * 3133. Minimum Array End
 */
public class MinimumArrayEnd{
    public long minEnd(int n, int x){
        int maxBit = (32 - Integer.numberOfLeadingZeros(n)) + (32 - Integer.numberOfLeadingZeros(x));
        long k = n - 1;
        long ret = x;
        int ind = 0;
        for(int i = 0; i < maxBit; i++){
            if((ret >> i & 1) == 0){
                if((k >> ind & 1) == 1){
                    ret |= 1L << i;
                }
                ind++;
            }
        }
        return ret;
    }
}
