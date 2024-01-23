package leetcode;

import resources.TreeNode;

/**
 * 104. Maximum Depth of Binary Tree
 */
public class MaximumDepthOfBinaryTree{
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = 1 + maxDepth(root.left);
        int right = 1 + maxDepth(root.right);

        return Math.max(left, right);
    }
}
