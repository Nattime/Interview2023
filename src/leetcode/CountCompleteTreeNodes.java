package leetcode;

import com.resources.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;

//        int count = 0;
//        if (root != null) {
//            Queue<TreeNode> queue = new LinkedList<>();
//            queue.add(root);
//            while (!queue.isEmpty()) {
//                TreeNode curr = queue.poll();
//                count++;
//                if(curr.left != null){
//                    queue.add(curr.left);
//                }
//                if(curr.right != null){
//                    queue.add(curr.right);
//                }
//            }
//        }
//
//        return count;
    }
}
