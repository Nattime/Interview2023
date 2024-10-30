package leetcode;

/**
 * 1122. Relative Sort Array
 */
public class RelativeSortArray{
    public int[] relativeSortArray(int[] arr1, int[] arr2){
        int[] count = new int[1001];
        int ind = 0;
        for(int num : arr1){
            count[num]++;
        }
        for(int num : arr2){
            while(count[num]-- > 0){
                arr1[ind++] = num;
            }
        }
        for(int i = 0; i < count.length; i++){
            while(count[i]-- > 0){
                arr1[ind++] = i;
            }
        }
        return arr1;
    }
}
