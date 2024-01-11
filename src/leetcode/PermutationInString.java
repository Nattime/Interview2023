package leetcode;

/**
 * 567 PermutationInString
 */
public class PermutationInString{
    public boolean checkInclusion(String s1, String s2){
        int len1 = s1.length();

        if(s2.length() < len1){
            return false;
        }

        int[] chars = new int[26];
        for(int i = 0; i < len1; i++){
            int index = s1.charAt(i) - 'a';
            chars[index]++;
            chars[(s2.charAt(i) - 'a')]--;
        }

        if(isZero(chars)){
            return true;
        }

        for(int i = len1; i < s2.length(); i++){
            int index = s2.charAt(i) - 'a';
            chars[index]--;
            chars[(s2.charAt(i - len1) - 'a')]++;
            if(isZero(chars)){
                return true;
            }
        }
        return false;
    }

    public boolean isZero(int[] ar1){
        for(int i = 0; i < 26; i++){
            if(ar1[i] != 0){
                return false;
            }
        }
        return true;
    }
}
