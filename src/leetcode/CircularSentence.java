package leetcode;

/**
 * 2490. Circular Sentence
 */
public class CircularSentence{
    public boolean isCircularSentence(String sentence){
        String[] arr = sentence.split(" ");
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1].charAt(arr[i - 1].length() - 1) != arr[i].charAt(0)){
                return false;
            }
        }
        return arr[arr.length - 1].charAt(arr[arr.length - 1].length() - 1) == arr[0].charAt(0);
    }
}
