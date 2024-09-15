package leetcode;

/**
 * 1684. Count the Number of Consistent Strings
 */
public class CountTheNumberOfConsistentStrings{
    public int countConsistentStrings(String allowed, String[] words){
        boolean[] arr = new boolean[32];
        int count = 0;
        for(int i = 0; i < allowed.length(); i++){
            int ind = allowed.charAt(i) - 'a';
            arr[ind] = true;
        }
        for(String iter : words){
            boolean hasLetter = false;
            for(int i = 0; i < iter.length(); i++){
                int ind = iter.charAt(i) - 'a';
                if(arr[ind]){
                    hasLetter = true;
                }else{
                    hasLetter = false;
                    break;
                }
            }
            if(hasLetter){
                count++;
            }
        }
        return count;
    }
}
