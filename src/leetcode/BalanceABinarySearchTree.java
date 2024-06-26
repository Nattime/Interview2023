package leetcode;

import com.resources.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 1382. Balance a Binary Search Tree
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
public class BalanceABinarySearchTree{
    public TreeNode balanceBST(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        int index = 0;
        while(index < list.size()){
            TreeNode curr = list.get(index);
            if(curr.left != null){
                list.add(curr.left);
            }
            if(curr.right != null){
                list.add(curr.right);
            }
            index++;
        }
        list.sort(Comparator.comparingInt(a->a.val));
        root = trav(list, 0, list.size() - 1);
        return root;
    }
    
    private TreeNode trav(List<TreeNode> list, int l, int r){
        if(l > r){
            return null;
        }
        int m = (r + l) >> 1;
        TreeNode curr = list.get(m);
        TreeNode left = trav(list, l, m - 1);
        TreeNode right = trav(list, m + 1, r);
        curr.left = left;
        curr.right = right;
        return curr;
    }
}
