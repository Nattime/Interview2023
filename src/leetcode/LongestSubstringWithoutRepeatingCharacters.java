package leetcode;

/**
 * 3. Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters{
    public int lengthOfLongestSubstring(String s){
        int[] arr = new int[127];
        int ret = 0;
        int count = 0;
        for(int l = 0, i = 0; i < s.length(); ){
            int ind = s.charAt(i);
            if(arr[ind] == 0){
                arr[ind]++;
                count++;
                i++;
            }else{
                int in = s.charAt(l);
                arr[in]--;
                count--;
                l++;
            }
            ret = Math.max(ret, count);
        }
        return ret;
    }
}
