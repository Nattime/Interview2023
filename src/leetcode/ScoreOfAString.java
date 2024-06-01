package leetcode;

/**
 * 3110. Score of a String
 */
public class ScoreOfAString{
    public int scoreOfString(String s){
        int sum = 0;
        for(int i = 1; i < s.length(); i++){
            sum += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return sum;
    }
}
