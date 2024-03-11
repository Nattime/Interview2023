package leetcode;

/**
 * 791. Custom Sort String
 */
public class CustomSortString{
    public String customSortString(String order, String s){
        char[] ch = new char[order.length()];
        int[] arr = new int[order.length()];
        char[] ret = new char[s.length()];
        for(int i = 0; i < order.length(); i++){
            char c = order.charAt(i);
            ch[i] = c;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ret[i] = c;
            int ind = containsLetter(c, ch);
            if(ind != -1){
                arr[ind]++;
            }
        }
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            int count = arr[i];
            char c = ch[i];
            while(count > 0){
                index = findIndex(index, ret, ch);
                ret[index] = c;
                count--;
                index++;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ret.length; i++){
            str.append(ret[i]);
        }
        return str.toString();
    }

    public int findIndex(int index, char[] cArr, char[] ch){
        for(int i = index; i < cArr.length; i++){
            if(containsLetter(cArr[i], ch) != -1){
                return i;
            }
        }
        return index;
    }

    public int containsLetter(char c, char[] ch){
        for(int i = 0; i < ch.length; i++){
            if(c == ch[i]){
                return i;
            }
        }
        return -1;
    }
}
