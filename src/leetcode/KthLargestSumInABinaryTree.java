package leetcode;

import com.resources.TreeNode;

import java.util.*;

/**
 * 2583. Kth Largest Sum in a Binary Tree
 */

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class KthLargestSumInABinaryTree{
    public long kthLargestLevelSum(TreeNode root, int k){
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b)->{
            return Long.compare(b, a);
        });
        while(!queue.isEmpty()){
            int size = queue.size();
            TreeNode trav;
            long sum = 0L;
            for(int i = 0; i < size; i++){
                trav = queue.poll();
                sum += trav.val;
                if(trav.left != null){
                    queue.add(trav.left);
                }
                if(trav.right != null){
                    queue.add(trav.right);
                }
            }
            pq.add(sum);
        }
        if(pq.size() < k){
            return -1;
        }
        for(int i = 1; i < k; i++){
            pq.poll();
        }
        return pq.poll();
    }
}
