package leetcode;

/**
 * 1790. Check if One String Swap Can Make Strings Equal
 */
public class CheckIfOneStringSwapCanMakeStringsEqual{
    public boolean areAlmostEqual(String s1, String s2){
        char[] arr = new char[2];
        char[] arr2 = new char[2];
        int ind = 0;
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(ind >= 2){
                    return false;
                }else{
                    arr[ind] = s1.charAt(i);
                    arr2[ind] = s2.charAt(i);
                }
                ind++;
            }
        }
        return ind == 0 || (arr[0] == arr2[1] && arr[1] == arr2[0]);
    }
}
