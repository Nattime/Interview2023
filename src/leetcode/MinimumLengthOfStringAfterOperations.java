package leetcode;

/**
 * 3223. Minimum Length of String After Operations
 */
public class MinimumLengthOfStringAfterOperations{
    public int minimumLength(String s){
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            int ind = (int)(s.charAt(i) - 'a');
            arr[ind]++;
        }
        int ret = 0;
        for(int iter : arr){
            if(iter > 2){
                if(iter % 2 == 0){
                    ret += 2;
                }else{
                    ret += 1;
                }
            }else{
                ret += iter;
            }
        }
        return ret;
    }
}
