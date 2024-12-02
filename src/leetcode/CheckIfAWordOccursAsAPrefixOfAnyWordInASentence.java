package leetcode;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence{
    public int isPrefixOfWord(String sentence, String searchWord){
        int ret = -1;
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].contains(searchWord) && arr[i].indexOf(searchWord) == 0){
                return i + 1;
            }
        }
        return ret;
    }
}
