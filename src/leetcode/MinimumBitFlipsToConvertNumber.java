package leetcode;

/**
 * 2220. Minimum Bit Flips to Convert Number
 */
public class MinimumBitFlipsToConvertNumber{
    public int minBitFlips(int start, int goal){
        int num = start ^ goal;
        int count = 0;
        while(num != 0){
            count += num & 1;
            num >>= 1;
        }
        return count;
    }
}
