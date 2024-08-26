package leetcode;

import com.resources.NaryNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
public class NaryTreePostorderTraversal{
    public List<Integer> postorder(NaryNode root){
        List<Integer> ret = new ArrayList<>();
        traverse(root, ret);
        return ret;
    }

    private void traverse(NaryNode root, List<Integer> list){
        if(root != null){
            if(root.children != null){
                List<NaryNode> children = root.children;
                if(!children.isEmpty()){
                    for(NaryNode iter : children){
                        traverse(iter, list);
                    }
                }
            }

            list.add(root.val);
        }
    }
}
