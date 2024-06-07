package leetcode;

import java.util.List;

/**
 * 648. Replace Words
 */
public class ReplaceWords{
    public String replaceWords(List<String> dictionary, String sentence){
        String[] arr = sentence.split(" ");
        StringBuilder str = new StringBuilder();
        Dict root = new Dict();
        for(String s : dictionary){
            root.add(s);
        }
        for(String iter : arr){
            str.append(" ").append(root.search(iter));
        }
        return str.substring(1);
    }
    
    private class Dict{
        private Dict[] children = new Dict[26];
        private String word;
        
        private String search(String str){
            Dict curr = this;
            for(char c : str.toCharArray()){
                if(curr.word != null){
                    return curr.word;
                }
                int i = c - 'a';
                if(curr.children[i] == null){
                    return str;
                }
                curr = curr.children[i];
            }
            return str;
        }
        
        private void add(String str){
            Dict curr = this;
            for(char c : str.toCharArray()){
                int i = c - 'a';
                if(curr.children[i] == null){
                    curr.children[i] = new Dict();
                }
                curr = curr.children[i];
            }
            curr.word = str;
        }
    }
}
