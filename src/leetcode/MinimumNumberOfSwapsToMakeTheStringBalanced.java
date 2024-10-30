package leetcode;

/**
 * 1963. Minimum Number of Swaps to Make the String Balanced
 */
public class MinimumNumberOfSwapsToMakeTheStringBalanced{
    public int minSwaps(String s){
        int lCount = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ']'){
                if(lCount == 0){
                    lCount++;
                }else{
                    lCount--;
                }
            }else{
                lCount++;
            }
        }
        return (lCount + 1) / 2;
    }
}
