package leetcode;

/**
 * 11 ContainerWithMostWater
 */
public class ContainerWithMostWater{
    public int maxArea(int[] height){
        int l = 0, r = height.length - 1;
        int max = 0;

        for(; l < r; ){
            int left = height[l];
            int right = height[r];
            int d = r - l;
            if(left < right){
                int a = d * left;
                max = Math.max(a, max);
                l++;
            }else{
                int a = d * right;
                max = Math.max(a, max);
                r--;
            }
        }

        return max;
    }
}
