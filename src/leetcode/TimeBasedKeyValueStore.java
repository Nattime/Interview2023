package leetcode;

import java.util.*;

/**
 * 981. Time Based Key-Value Store
 * <p>
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
public class TimeBasedKeyValueStore{
    Map<String, Deque<TimePair>> map;

    public void TimeMap(){
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp){
        if(map.containsKey(key)){
            Deque<TimePair> queue = map.get(key);
            queue.add(new TimePair(value, timestamp));
        }else{
            Deque<TimePair> queue = new LinkedList<>();
            TimePair timePair = new TimePair(value, timestamp);
            queue.add(timePair);
            map.put(key, queue);
        }
    }

    public String get(String key, int timestamp){
        if(map.containsKey(key)){
            Deque<TimePair> q = map.get(key);
            if(q.getLast().time <= timestamp){
                return q.getLast().val;
            }else{
                for(Iterator<TimePair> it = q.descendingIterator(); it.hasNext(); ){
                    TimePair pair = it.next();
                    if(pair.time <= timestamp){
                        return pair.val;
                    }
                }
            }
        }
        return "";
    }
}

class TimePair{
    String val;
    int time;

    public TimePair(String val, int time){
        this.val = val;
        this.time = time;
    }
}