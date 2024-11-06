package leetcode;

/**
 * 796. Rotate String
 */
public class RotateString{
    public boolean rotateString(String s, String goal){
        if(s.length() == goal.length()){
            String doublestring = goal + goal;
            if(doublestring.contains(s)){
                return true;
            }
        }
        return false;
    }
}
