package leetcode;

import java.util.*;

/**
 * 2192. All Ancestors of a Node in a Directed Acyclic Graph
 */
public class AllAncestorsOfANodeInADirectedAcyclicGraph{
    public List<List<Integer>> getAncestors(int n, int[][] edges){
        List<Integer>[] graph = new List[n];
        Arrays.setAll(graph, i->new ArrayList<>());
        for(int[] iter : edges){
            graph[iter[0]].add(iter[1]);
        }
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            ret.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            helper(graph, i, n, ret);
        }
        return ret;
    }
    
    private void helper(List<Integer>[] graph, int start, int n, List<List<Integer>> ret){
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        boolean[] visited = new boolean[n];
        visited[start] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            for(int next : graph[curr]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.offer(next);
                    ret.get(next).add(start);
                }
            }
        }
    }
}
