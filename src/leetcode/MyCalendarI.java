package leetcode;

import java.util.TreeMap;

/**
 * 729. My Calendar I
 */

/*
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
public class MyCalendarI{
    static class MyCalendar{
        TreeMap<Integer, Integer> map = new TreeMap<>();

        public MyCalendar(){
        }

        public boolean book(int start, int end){
            Integer low = map.lowerKey(end);

            if(low == null || start >= map.get(low)){
                map.put(start, end);
                return true;
            }

            return false;
        }
    }
}
