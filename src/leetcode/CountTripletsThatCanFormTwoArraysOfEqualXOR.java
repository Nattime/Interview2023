package leetcode;

/**
 * 1442. Count Triplets That Can Form Two Arrays of Equal XOR
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXOR{
    public int countTriplets(int[] arr){
        int ret = 0;
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int sum = arr[i];
            for(int k = i + 1; k < len; k++){
                sum = sum ^ arr[k];
                if(sum == 0){
                    ret += (k - i);
                }
            }
        }
        return ret;
    }
}
