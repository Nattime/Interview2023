package leetcode;

import java.util.*;

/**
 * 752. Open the Lock
 */
public class OpenTheLock{
    public int openLock(String[] deadends, String target){
        if(target.equals("0000")){
            return 0;
        }
        Set<String> set = new HashSet<>(Arrays.asList(deadends));
        if(set.contains("0000")){
            return -1;
        }
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("0000");
        set.add("0000");
        int ans = 0;
        while(!deque.isEmpty()){
            ans++;
            for(int n = deque.size(); n > 0; --n){
                String str = deque.poll();
                for(String iter : turnPin(str)){
                    if(target.equals(iter)){
                        return ans;
                    }
                    if(!set.contains(iter)){
                        deque.offer(iter);
                        set.add(iter);
                    }
                }
            }
        }
        return -1;
    }

    private List<String> turnPin(String str){
        List<String> res = new ArrayList<>();
        char[] arr = str.toCharArray();
        for(int i = 0; i < 4; ++i){
            char c = arr[i];
            arr[i] = c == '0' ? '9' : (char)(c - 1);
            res.add(String.valueOf(arr));
            arr[i] = c == '9' ? '0' : (char)(c + 1);
            res.add(String.valueOf(arr));
            arr[i] = c;
        }
        return res;
    }
}