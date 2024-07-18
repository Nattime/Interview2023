package leetcode;

import com.resources.TreeNode;

/**
 * 1530. Number of Good Leaf Nodes Pairs
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class NumberOfGoodLeafNodesPairs{
    public int countPairs(TreeNode root, int distance){
        count = 0;
        dfs(root, distance);
        return count;
    }
    
    private int count = 0;
    
    private int[] dfs(TreeNode node, int distance){
        int[] arr = new int[distance + 1];
        if(node == null){
            return arr;
        }
        if(node.left == null && node.right == null){
            arr[0] = 1;
            return arr;
        }
        int[] arrLeft = dfs(node.left, distance);
        int[] arrRight = dfs(node.right, distance);
        for(int i = 0; i < distance; ++i){
            for(int j = 0; j < distance; ++j){
                if(i + j + 2 <= distance){
                    count += arrLeft[i] * arrRight[j];
                }
            }
        }
        for(int i = 0; i < distance; ++i){
            arr[i + 1] = arrLeft[i] + arrRight[i];
        }
        return arr;
    }
}
