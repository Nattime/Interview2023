package leetcode;

import com.resources.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 2196. Create Binary Tree From Descriptions
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
public class CreateBinaryTreeFromDescriptions{
    public TreeNode createBinaryTree(int[][] descriptions){
        Map<Integer, TreeNode> map = new HashMap<>();
        TreeNode root = null;
        Set<Integer> set = new HashSet<>();
        for(int[] iter : descriptions){
            int num = iter[0];
            int nodeVal = iter[1];
            set.add(num);
            set.add(nodeVal);
            TreeNode n = new TreeNode(num);
            if(map.containsKey(num)){
                n = map.get(num);
                if(map.containsKey(nodeVal)){
                    TreeNode temp = map.get(nodeVal);
                    if(iter[2] == 0){
                        n.right = temp;
                    }else{
                        n.left = temp;
                    }
                }else{
                    TreeNode temp = new TreeNode(nodeVal);
                    if(iter[2] == 0){
                        n.right = temp;
                    }else{
                        n.left = temp;
                    }
                    map.put(nodeVal, temp);
                }
            }else{
                if(map.containsKey(nodeVal)){
                    if(iter[2] == 0){
                        n.right = map.get(nodeVal);
                    }else{
                        n.left = map.get(nodeVal);
                    }
                }else{
                    TreeNode temp = new TreeNode(nodeVal);
                    if(iter[2] == 0){
                        n.right = temp;
                    }else{
                        n.left = temp;
                    }
                    map.put(nodeVal, temp);
                }
                map.put(num, n);
            }
        }
        for(Map.Entry<Integer, TreeNode> integerTreeNodeEntry : map.entrySet()){
            if(integerTreeNodeEntry.getValue().left != null){
                int num = integerTreeNodeEntry.getValue().left.val;
                set.remove(num);
            }
            if(integerTreeNodeEntry.getValue().right != null){
                int num = integerTreeNodeEntry.getValue().right.val;
                set.remove(num);
            }
        }
        for(Integer i : set){
            root = map.get(i);
        }
        return root;
    }
}
