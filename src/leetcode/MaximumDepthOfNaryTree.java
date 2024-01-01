package leetcode;

import resources.NaryNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfNaryTree{
    public int maxDepth(NaryNode root) {
        int depth = 0;

        if(root != null){
            Queue<NaryNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                int size = q.size();
                for(int i = 0; i < size; i++){
                    NaryNode curr = q.poll();
                    if(curr.children != null && !curr.children.isEmpty()){
                        q.addAll(curr.children);
                    }
                }
                depth++;
            }
        }

        return depth;
    }
}
