package leetcode;

/**
 * 387. First Unique Character in a String
 */
public class FirstUniqueCharacterInAString{
    public int firstUniqChar(String s){
        if(s.isEmpty()){
            return 0;
        }
        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int ind = (int)(ch - 'a');
            if(arr[ind] == 0){
                arr[ind] = i;
            }else if(arr[ind] > 0){
                arr[ind] = -i;
            }
        }

        int in = (s.charAt(0) - 'a');
        if(arr[in] == 0){
            return 0;
        }
        int min = s.length() + 1;
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0 && i != in){
                min = Math.min(min, arr[i]);
            }
        }
        return min == s.length() + 1 ? -1 : (arr[(s.charAt(0) - 'a')] == min ? -1 : min);
    }
}
