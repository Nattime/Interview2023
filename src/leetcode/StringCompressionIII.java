package leetcode;

/**
 * 3163. String Compression III
 */
public class StringCompressionIII{
    public String compressedString(String word){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            int count = 1;
            for(int j = i + 1; j < word.length(); j++){
                if(ch == word.charAt(j)){
                    i++;
                    count++;
                }else{
                    break;
                }
            }
            while(count > 0){
                if(count > 9){
                    str.append(9).append(ch);
                }else{
                    str.append(count).append(ch);
                }
                count -= 9;
            }
        }
        return str.toString();
    }
}
