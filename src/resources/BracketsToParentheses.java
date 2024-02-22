package resources;

public class BracketsToParentheses{
    public static String convert(String str){
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '['){
                ret.append("{");
            }else if(ch == ']'){
                ret.append("}");
            }else{
                ret.append(ch);
            }
        }
        return ret.toString();
    }
}
