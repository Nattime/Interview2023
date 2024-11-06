package leetcode;

/**
 * 1957. Delete Characters to Make Fancy String
 */
public class DeleteCharactersToMakeFancyString{
    public String makeFancyString(String s){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int count = 1;
            int j = i + 1;
            while(j < s.length()){
                if(s.charAt(j) == ch){
                    j++;
                    count++;
                }else{
                    j--;
                    break;
                }
            }
            if(count >= 2){
                str.append(ch).append(ch);
                i = j;
            }else{
                str.append(ch);
            }
        }
        return str.toString();
    }
}
