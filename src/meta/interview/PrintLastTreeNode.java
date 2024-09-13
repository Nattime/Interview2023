package meta.interview;

import com.resources.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 9/12/24
 * Part 1: Define a Node for a binary tree
 *
 * Part 2:
 *      6
 *     / \
 *    2   3
 *     \
 *      5
 *  Prints: [6, 3, 5]
 *        6
 *       / \
 *      2   3
 *     /     \
 *    4       1
 *     \
 *      5
 *  Prints: [6, 3, 1, 5]
 */
public class PrintLastTreeNode{
    public List<Integer> getLastNodeValues(Node root){
        List<Integer> ret = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 1; i <= size; i++){
                Node curr = queue.poll();
                if(i == size){
                    ret.add(curr.data);
                }
                if(curr.prev != null){
                    queue.add(curr.prev);
                }
                if(curr.next != null){
                    queue.add(curr.next);
                }
            }
        }
        return ret;
    }
}
