package leetcode;

/**
 * 2825. Make String a Subsequence Using Cyclic Increments
 */
public class MakeStringASubsequenceUsingCyclicIncrements{
    public boolean canMakeSubsequence(String str1, String str2){
        int ind1 = 0;
        int ind2 = 0;
        while(ind2 < str2.length() && ind1 < str1.length()){
            if(str1.charAt(ind1) == str2.charAt(ind2) || ((str1.charAt(ind1) - 'a' + 1) % 26) == (str2.charAt(ind2) - 'a')){
                ind2++;
            }
            ind1++;
        }
        return ind2 == str2.length();
    }
}
