package leetcode;

/**
 * 1544. Make The String Great
 */
public class MakeTheStringGreat{
    public String makeGood(String s){
        char[] arr = s.toCharArray();
        int beg = 0;
        int trav = 0;
        int len = s.length();
        while(trav < len){
            if(beg > 0 && Math.abs(arr[beg - 1] - arr[trav]) == 32){
                beg--;
            }else{
                arr[beg] = arr[trav];
                beg++;
            }
            trav++;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < beg; ++i){
            if(arr[i] != ' '){
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
