package leetcode;

import java.util.*;

/**
 * 1481. Least Number of Unique Integers after K Removals
 */
public class LeastNumberOfUniqueIntegersAfterKRemovals{
    public int findLeastNumOfUniqueInts(int[] arr, int k){
        Vector<Integer> vector = new Vector<>();
        int in = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int iter : arr){
            Integer index = map.get(iter);
            if(index == null){
                map.put(iter, in++);
                vector.add(1);
            }else{
                vector.set(index, vector.get(index) + 1);
            }
        }

        Collections.sort(vector);

        int i = 0;
        while(k > 0){
            k -= vector.get(i++);
            if(k == 0){
                break;
            }else if(k < 0){
                i--;
                break;
            }
        }
        return vector.size() - i;
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for(int iter : arr){
//            Integer count = map.get(iter);
//            if(count != null){
//                map.replace(iter, count + 1);
//            }else{
//                map.put(iter, 1);
//            }
//        }
//
//        Map<Integer, Integer> sortedByCount = map.entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue())
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2)->e1, LinkedHashMap::new));
//
//        int c = 0;
//        for(Map.Entry<Integer, Integer> iter : sortedByCount.entrySet()){
//            k = k - iter.getValue();
//            c++;
//            if(k == 0){
//                break;
//            }else if(k < 0){
//                c--;
//                break;
//            }
//        }
//
//        return map.size() - c;
    }
}
