package leetcode;

/**
 * 165. Compare Version Numbers
 */
public class CompareVersionNumbers{
    public int compareVersion(String version1, String version2){
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int len = Math.max(arr1.length, arr2.length);
        for(int i = 0; i < len; i++){
            int i1 = i < arr1.length ? Integer.parseInt(arr1[i]) : 0;
            int i2 = i < arr2.length ? Integer.parseInt(arr2[i]) : 0;
            if(i1 < i2){
                return -1;
            }else if(i1 > i2){
                return 1;
            }
        }
        return 0;
    }
}
