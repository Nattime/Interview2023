package leetcode;

import com.resources.TreeNode;

/**
 * 617. Merge Two Binary Trees
 */
public class MergeTwoBinaryTrees{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2){
        if(root1 != null && root2 != null){
            root1.val += root2.val;
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
        }else if(root2 != null){
            return root2;
        }
        return root1;
    }
}
