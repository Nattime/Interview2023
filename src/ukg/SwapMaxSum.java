package ukg;

import java.util.List;

/*
    interview: 9/19/24 hackerrank ukg

    return the maximum sum of the array
        -maximum 1 swap per cell

    ex1:
        {2, 1, 4, 3}
            swap(0, 1)
            swap(2, 3)
        {1, 2, 3, 4}
        = 1 * 1 + 2 * 2 + 3 * 3 + 4 * 4;
        sum = 30;


    ex2:
        {1, 9, 7, 3, 2}
        swap(2, 3)
        {1, 9, 3, 7, 2}
        = 1 * 1 + 2 * 9 + 3 * 3 + 4 * 7 + 5 * 2;
        sum = 66;
 */
public class SwapMaxSum{
    public long getMaximumSum(List<Integer> list){
        long ret = 0;
        long maxRet = list.get(0);

        for(int i = 1; i < list.size() - 1; i++){
            System.out.println(maxRet + " " + ret);
            maxRet = Math.max(maxRet + (long)list.get(i) * (i + 1), maxRet + list.get(i + 1) * (i + 1));
            ret = Math.max(ret, maxRet);
//            System.out.println(maxRet + " " + ret);
        }

        return ret;
    }
}
