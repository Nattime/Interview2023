package leetcode;

/**
 * 2485. Find the Pivot Integer
 */
public class FindThePivotInteger{
    public int pivotInteger(int n){
        int beg = 1;
        int end = n;
        int fsum = 0;
        int esum = 0;

        while(beg < end){
            if(fsum < esum){
                fsum += beg;
                beg++;
            }else{
                esum += end;
                end--;
            }
        }

        if(beg == end && (fsum == esum)){
            return beg;
        }

        return -1;
    }
}
