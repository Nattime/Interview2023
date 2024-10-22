package meta.interview.coding241015;

import java.util.ArrayList;
import java.util.List;

/**
 * 10/16/24
 * Meta day 2 coding question 4
 * Given two nodes on a tree, try and find the first ancestor they have in common. Nodes have pointers to their parent and their children.
 * It is given that both nodes are on the same tree.
 */
/*
 *         A
 *       /   \
 *      B     C
 *     / \   / \
 *    D   E F   G
 *   /         /
 *  H         I
 */
/*
 *         1
 *       /   \
 *      2     3
 *     / \   / \
 *    4   5 6   7
 *   /         /
 *  8         9
 */
public class Question4CommonAncestor{
    static class NodeWithParents{
        public int val;
        public NodeWithParents parent;
        public NodeWithParents left;
        public NodeWithParents right;

        public NodeWithParents(int val, NodeWithParents parent){
            this.val = val;
            this.parent = parent;
            this.left = null;
            this.right = null;
        }

        @Override
        public boolean equals(Object o){
            NodeWithParents b = (NodeWithParents)o;
            return this.val == b.val && this.parent == b.parent && this.left == b.left && this.right == b.right;
        }
    }

    NodeWithParents findAncestor(NodeWithParents a, NodeWithParents b){
        List<NodeWithParents> list = new ArrayList<>();
        NodeWithParents trav = a;
        while(trav != null){
            list.add(trav);
            trav = trav.parent;
        }
        trav = b;
        while(trav != null){
            if(list.contains(trav)){
                return trav;
            }
            trav = trav.parent;
        }
        return null;
    }
}
