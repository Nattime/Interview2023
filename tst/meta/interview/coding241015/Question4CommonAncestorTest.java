package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question4CommonAncestorTest{
    private static Question4CommonAncestor test;

    @BeforeAll
    static void beforeAll(){
        test = new Question4CommonAncestor();
    }

    private Question4CommonAncestor.NodeWithParents getNode(Question4CommonAncestor.NodeWithParents root, int val){
        Queue<Question4CommonAncestor.NodeWithParents> queue = new LinkedList<>();
        queue.add(root);
        Question4CommonAncestor.NodeWithParents trav = null;
        while(!queue.isEmpty()){
            trav = queue.poll();
            if(trav.val == val){
                return trav;
            }
            if(trav.left != null){
                queue.add(trav.left);
            }
            if(trav.right != null){
                queue.add(trav.right);
            }
        }
        return trav;
    }

    private static Question4CommonAncestor.NodeWithParents createBinaryTree(int[] arr){
        Question4CommonAncestor.NodeWithParents root = new Question4CommonAncestor.NodeWithParents(arr[0], null);
        Queue<Question4CommonAncestor.NodeWithParents> q = new LinkedList<>();
        q.add(root);
        for(int i = 1; i < arr.length; ++i){
            Question4CommonAncestor.NodeWithParents curr = q.poll();
            Question4CommonAncestor.NodeWithParents n;
            if(arr[i] == -1){
                curr.left = null;
            }else{
                n = new Question4CommonAncestor.NodeWithParents(arr[i], curr);
                curr.left = n;
                q.add(n);
            }
            ++i;
            if(i < arr.length){
                if(arr[i] == -1){
                    curr.right = null;
                }else{
                    n = new Question4CommonAncestor.NodeWithParents(arr[i], curr);
                    curr.right = n;
                    q.add(n);
                }
            }
        }
        return root;
    }

    private static void printLevelOrderHelper(Question4CommonAncestor.NodeWithParents root){
        if(root == null){
            System.out.println("Empty tree");
        }
        Queue<Question4CommonAncestor.NodeWithParents> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            Question4CommonAncestor.NodeWithParents curr;
            for(int i = 0; i < size; ++i){
                curr = q.remove();
                if(curr == null){
                    System.out.print("N ");
                }else{
                    System.out.print(curr.val + " parent: " + (curr.parent == null ? -1 : curr.parent.val) + " ");
                    q.add(curr.left);
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }

    @Test
    @DisplayName("test_findAncestor_case1")
    void test_findAncestor_case1(){
        Question4CommonAncestor.NodeWithParents root = createBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, -1, -1, -1, -1, -1, 9});
        Question4CommonAncestor.NodeWithParents a = getNode(root, 8);
        Question4CommonAncestor.NodeWithParents b = getNode(root, 5);
        Question4CommonAncestor.NodeWithParents output = getNode(root, 2);
        System.out.println(test.findAncestor(a, b).val);
        assertEquals(test.findAncestor(a, b), output);
    }

    @Test
    @DisplayName("test_findAncestor_case2")
    void test_findAncestor_case2(){
        Question4CommonAncestor.NodeWithParents root = createBinaryTree(new int[]{1, 2, 3, 4, 5, 6, 7, 8, -1, -1, -1, -1, -1, 9});
        Question4CommonAncestor.NodeWithParents a = getNode(root, 9);
        Question4CommonAncestor.NodeWithParents b = getNode(root, 5);
        Question4CommonAncestor.NodeWithParents output = getNode(root, 1);
        System.out.println(test.findAncestor(a, b).val);
        assertEquals(test.findAncestor(a, b), output);
    }

    @Test
    @DisplayName("test_findAncestor_case3")
    void test_findAncestor_case3(){

    }
}