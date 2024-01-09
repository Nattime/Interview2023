package leetcode;

import resources.TreeNode;

/**
 * 938. Range Sum of BST
 */
public class RangeSumOfBST{
    /**
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        int val = root.val;
        if(val >= low && val <= high){
            return rangeSumBST(root.left, low, high) + val + rangeSumBST(root.right, low, high);
        }else{
            return rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }
    }
}
