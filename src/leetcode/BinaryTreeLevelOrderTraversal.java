package leetcode;

import com.resources.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 102. Binary Tree Level Order Traversal
 */
public class BinaryTreeLevelOrderTraversal{
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ret = new LinkedList<>();
        if(root != null){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                int size = queue.size();
                List<Integer> list = new LinkedList<>();
                for(int i = 0; i < size; i++){
                    TreeNode curr = queue.poll();
                    list.add(curr.val);
                    if(curr.left != null){
                        queue.add(curr.left);
                    }
                    if(curr.right != null){
                        queue.add(curr.right);
                    }
                }
                ret.add(list);
            }
        }
        return ret;
    }
}
