package leetcode;

import com.resources.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 2458. Height of Binary Tree After Subtree Removal Queries
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
public class HeightOfBinaryTreeAfterSubtreeRemovalQueries{
    private Map<Integer, Integer> maxHeight = new HashMap<>();
    private Map<Integer, Integer> valHeight = new HashMap<>();

    public int[] treeQueries(TreeNode root, int[] queries){
        int[] ret = new int[queries.length];
        dfs(root, 0, 0);
        for(int i = 0; i < queries.length; ++i){
            ret[i] = maxHeight.get(queries[i]);
        }
        return ret;
    }

    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        if(valHeight.containsKey(root.val)){
            return valHeight.get(root.val);
        }
        final int h = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        valHeight.put(root.val, h);
        return h;
    }

    private void dfs(TreeNode node, int depth, int max){
        if(node != null){
            maxHeight.put(node.val, max);
            dfs(node.left, depth + 1, Math.max(max, depth + getHeight(node.right)));
            dfs(node.right, depth + 1, Math.max(max, depth + getHeight(node.left)));
        }
    }
}
