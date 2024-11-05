package leetcode;

/**
 * 2914. Minimum Number of Changes to Make Binary String Beautiful
 */
public class MinimumNumberOfChangesToMakeBinaryStringBeautiful{
    public int minChanges(String s) {
        int count = 0;
        for(int i = 1; i < s.length(); i += 2){
            if(s.charAt(i) != s.charAt(i - 1)){
                count++;
            }
        }
        return count;
    }
}
