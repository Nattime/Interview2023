package leetcode;

/**
 * 2425. Bitwise XOR of All Pairings
 */
public class BitwiseXOROfAllPairings{
    public int xorAllNums(int[] nums1, int[] nums2){
        int a = 0;
        int b = 0;
        for(int iter : nums1){
            a ^= iter;
        }
        for(int iter : nums2){
            b ^= iter;
        }
        return (nums1.length % 2 * b) ^ (nums2.length % 2 * a);
    }
}
