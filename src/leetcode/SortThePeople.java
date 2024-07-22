package leetcode;

import java.util.PriorityQueue;

/**
 * 2418. Sort the People
 */
public class SortThePeople{
    class Pair implements Comparable<Pair>{
        private final int height;
        private final String name;
        
        public Pair(int height, String name){
            this.height = height;
            this.name = name;
        }
        
        @Override
        public int compareTo(Pair o){
            return Integer.compare(o.height, height);
        }
    }
    
    public String[] sortPeople(String[] names, int[] heights){
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < names.length; i++){
            priorityQueue.add(new Pair(heights[i], names[i]));
        }
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i] + " ");
            names[i] = priorityQueue.poll().name;
            System.out.println(names[i]);
        }
        return names;
    }
}
