package leetcode;

/**
 * 1945. Sum of Digits of String After Convert
 */
public class SumOfDigitsOfStringAfterConvert{
    public int getLucky(String s, int k){
        int ret = 0;
        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - 'a' + 1;
            while(num > 0){
                ret += num % 10;
                num /= 10;
            }
        }
        for(int i = 1; i < k; i++){
            int num = 0;
            while(ret > 0){
                num += ret % 10;
                ret /= 10;
            }
            ret = num;
        }
        return ret;
    }
}
