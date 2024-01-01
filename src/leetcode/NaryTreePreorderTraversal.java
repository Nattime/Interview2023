package leetcode;

import resources.NaryNode;

import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversal{
    List<Integer> list = new LinkedList<>();
    public List<Integer> preorder(NaryNode root) {
        if(root != null){
            list.add(root.val);
            if(root.children != null && !root.children.isEmpty()){
                for(NaryNode iter : root.children){
                    preorder(iter);
                }
            }
        }
        return list;
    }
}
