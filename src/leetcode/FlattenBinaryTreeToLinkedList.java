package leetcode;

import com.resources.TreeNode;

/**
 * 114. Flatten Binary Tree to Linked List
 */
public class FlattenBinaryTreeToLinkedList{
    public void flatten(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode current, prev;
        current = root;
        while(current != null){
            if(current.left != null){
                prev = current.left;
                while(prev.right != null && prev.right != current){
                    prev = prev.right;
                }
                prev.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
