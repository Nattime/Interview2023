package leetcode;

import java.util.Arrays;

/**
 * 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance
 */
public class FindTheCityWithTheSmallestNumberOfNeighborsAtAThresholdDistance{
    public int findTheCity(int n, int[][] edges, int distanceThreshold){
        int[][] fwArr = new int[n][n];
        Arrays.stream(fwArr).forEach(A->Arrays.fill(A, distanceThreshold + 1));
        for(int i = 0; i < n; i++){
            fwArr[i][i] = 0;
        }
        for(int[] iter : edges){
            int i = iter[0];
            int j = iter[1];
            int w = iter[2];
            fwArr[i][j] = w;
            fwArr[j][i] = w;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    fwArr[j][k] = Math.min(fwArr[j][k], fwArr[j][i] + fwArr[i][k]);
                }
            }
        }
        int ret = -1;
        int minCity = n;
        for(int i = 0; i < n; i++){
            int cityCount = 0;
            for(int j = 0; j < n; j++){
                if(fwArr[i][j] <= distanceThreshold){
                    cityCount++;
                }
            }
            if(cityCount <= minCity){
                ret = i;
                minCity = cityCount;
            }
        }
        return ret;
    }
}
