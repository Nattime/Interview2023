package leetcode;

/**
 * 650. 2 Keys Keyboard
 */
public class TwoKeysKeyboard{
    public int minSteps(int n){
        int[] smallPrime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        int ret = 0;
        boolean isPrime = true;
        do{
            isPrime = false;
            for(int i : smallPrime){
                if(n % i == 0){
                    ret += i;
                    n /= i;
                    isPrime = true;
                    break;
                }
            }
        }while(isPrime);
        return n == 1 ? ret : ret + n;
    }
}
