package leetcode;

/**
 * 3043. Find the Length of the Longest Common Prefix
 */
public class FindTheLengthOfTheLongestCommonPrefix{
    class Trie{
        public Trie[] children = new Trie[10];
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2){
        Trie root = new Trie();
        for(int iter : arr1){
            String arr = String.valueOf(iter);
            Trie curr = root;
            for(int i = 0; i < arr.length(); i++){
                int ind = arr.charAt(i) - '0';
                if(curr.children[ind] == null){
                    curr.children[ind] = new Trie();
                }
                curr = curr.children[ind];
            }
        }
        int maxLen = 0;
        for(int iter : arr2){
            String arr = String.valueOf(iter);
            Trie curr = root;
            int count = 0;
            for(int i = 0; i < arr.length(); i++){
                int ind = arr.charAt(i) - '0';
                if(curr.children[ind] == null){
                    break;
                }
                count++;
                curr = curr.children[ind];
            }
            maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }
}
