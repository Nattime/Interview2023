package leetcode;

/**
 * 2000. Reverse Prefix of Word
 */
public class ReversePrefixOfWord{
    public String reversePrefix(String word, char ch){
        int index = word.indexOf(ch) + 1;
        if(index != 0){
            StringBuilder str = new StringBuilder(word.substring(0, index));
            return str.reverse().append(word.substring(index)).toString();
        }
        return word;
    }
}
