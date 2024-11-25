package leetcode;

/**
 * 1652. Defuse the Bomb
 */
public class DefuseTheBomb{
    public int[] decrypt(int[] code, int k){
        int len = code.length;
        int[] ret = new int[len];
        if(k < 0){
            int index = len + k;
            int sum = 0;
            for(int i = index; i < len; i++){
                sum += code[i];
            }
            ret[0] = sum;
            for(int i = 1; i < len; i++){
                sum += code[i - 1];
                sum -= code[(index++) % len];
                ret[i] = sum;
            }
        }else if(k > 0){
            int sum = 0;
            for(int i = 0; i < k; i++){
                sum += code[i];
            }
            for(int i = 0; i < len; i++){
                sum -= code[i];
                sum += code[(i + k) % len];
                ret[i] = sum;
            }
        }
        return ret;
    }
}
