package leetcode;

import java.util.PriorityQueue;

/**
 * 1942. The Number of the Smallest Unoccupied Chair
 */
public class TheNumberOfTheSmallestUnoccupiedChair{
    static class TimeSeat implements Comparable<TimeSeat>{
        int time;
        int seat;

        public TimeSeat(int leave, int seat){
            this.seat = seat;
            time = leave;
        }

        @Override
        public int compareTo(TimeSeat o){
            return time - o.time;
        }
    }

    static class TimePair implements Comparable<TimePair>{
        int arrive;
        int leave;

        public TimePair(int arrive, int leave){
            this.arrive = arrive;
            this.leave = leave;
        }

        @Override
        public int compareTo(TimePair o){
            return arrive - o.arrive;
        }
    }

    public int smallestChair(int[][] times, int targetFriend){
        PriorityQueue<Integer> chairs = new PriorityQueue<>();
        PriorityQueue<TimeSeat> person = new PriorityQueue<>();
        PriorityQueue<TimePair> arrival = new PriorityQueue<>();
        int lastPersonTime = 0;
        int firstPersonTime = Integer.MAX_VALUE;
        int friendTime = times[targetFriend][0];
        for(int i = 0; i < times.length; i++){
            chairs.add(i);
        }
        for(int[] time : times){
            arrival.add(new TimePair(time[0], time[1]));
            lastPersonTime = Math.max(lastPersonTime, time[0]);
            firstPersonTime = Math.min(firstPersonTime, time[0]);
        }
        for(; firstPersonTime <= lastPersonTime; firstPersonTime++){
            while(!person.isEmpty() && (person.peek().time == firstPersonTime)){
                TimeSeat temp = person.poll();
                chairs.add(temp.seat);
            }
            if(!arrival.isEmpty()){
                if(arrival.peek().arrive == firstPersonTime){
                    if(firstPersonTime == friendTime){
                        return chairs.poll();
                    }
                    TimePair temp = arrival.poll();
                    person.add(new TimeSeat(temp.leave, chairs.poll()));
                }
            }
        }
        return 0;
    }
}
