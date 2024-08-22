package leetcode;

/**
 * 476. Number Complement
 */
public class NumberComplement{
    public int findComplement(int num){
        StringBuilder str = new StringBuilder();
        while(num > 0){
            int n = num % 2;
            if(n == 1){
                str.insert(0, "0");
            }else{
                str.insert(0, "1");
            }
            num /= 2;
        }
        int ret = 0;
        for(int i = str.length() - 1, j = 0; i >= 0; i--, ++j){
            if(str.charAt(i) == '1'){
                ret += (int)Math.pow(2, j);
            }
        }
        return ret;
    }
}
