package resources;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Print{
    public static boolean test = false;
//    public static boolean test = true;

    private static long start = System.currentTimeMillis();

    private static void startTime(){
        start = System.currentTimeMillis();
    }

    private static void printExecutionTime(){
        System.out.println();
        System.out.println("Execution time is " + (System.currentTimeMillis() - start) + "ms");
        System.out.println();
    }

    public static void testPrint(){
        test = true;
        short[] shortarr = {1, 2, 3, 4};
        byte[] bytearr = {1, 2, 3, 4};
        int[] intarr = {1, 2, 3, 4};
        long[] longarr = {1L, 2L, 3L, 4L};
        boolean[] boolarr = {true, false};
        char[] chararr = {'a', 'b', 'c'};
        float[] floatarr = {1.1f, 2.2f, 3.3f, 4.4f};
        double[] doublearr = {1.1d, 2.2d, 3.3d, 4.4d};
        String[] strarr = {"1", "2", "three", "four"};
        Integer[] Intarr = {1, 2, 3, 4};
        Long[] Longarr = {1L, 2L, 3L, 4L};
        Print.print(shortarr);
        Print.print(shortarr, true);
        Print.print(bytearr);
        Print.print(bytearr, true);
        Print.print(intarr);
        Print.print(intarr, true);
        Print.print(longarr);
        Print.print(longarr, true);
        Print.print(boolarr);
        Print.print(boolarr, true);
        Print.print(strarr);
        Print.print(strarr, true);
        Print.print(chararr);
        Print.print(chararr, true);
        Print.print(floatarr);
        Print.print(floatarr, true);
        Print.print(doublearr);
        Print.print(doublearr, true);
        Print.print(Intarr);
        Print.print(Intarr, true);
        Print.print(Longarr);
        Print.print(Longarr, true);
//        temp.testPrint();

        Print.print((short)(1));
        Print.print((int)(1));
        Print.print((byte)(1));
        Print.print((long)(1L));
        Print.print((float)(1.0f));
        Print.print((double)(1.0d));
        Print.print(false);
        Print.print('a');
        Print.print("hello world");

        int[][] intmatrix = {{1, 2, 3}, {4, 5, 6}};
        Long[][] Longmatrix = {{1L, 2L, 3L}, {4L, 5L, 6L}};
        String[][] strmatrix = {{"one", "two"}, {"three", "four"}};
        Print.print(intmatrix);
        Print.print(Longmatrix);
        Print.print(strmatrix);

        Print.print(1);
        Print.print(1L);
        Print.print(true);
        Print.print("string");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.setNext(n2);
        Node n3 = new Node(3);
        n2.setNext(n3);
        Print.print(n1);

        test = false;
    }

    private static void print(boolean [] arr){
        print(arr, false);
    }

    private static void print(int[] arr){
        print(arr, false);
    }

    private static void print(short[] arr){
        print(arr, false);
    }

    private static void print(byte[] arr){
        print(arr, false);
    }

    private static void print(long[] arr){
        print(arr, false);
    }

    private static <T> void print(T[] arr){
        print(arr, false);
    }

    private static void print(short[] arr, boolean newLine){
        if(test) System.out.println("short arr " + newLine);
        startTime();
        for(short iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(byte[] arr, boolean newLine){
        if(test) System.out.println("byte arr " + newLine);
        startTime();
        for(short iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(int[] arr, boolean newLine){
        if(test) System.out.println("int arr " + newLine);
        startTime();
        for(int iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(long[] arr, boolean newLine){
        if(test) System.out.println("long arr " + newLine);
        startTime();
        for(long iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(boolean[] arr, boolean newLine){
        if(test) System.out.println("boolean arr " + newLine);
        startTime();
        for(boolean iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(char[] arr, boolean newLine){
        if(test) System.out.println("char arr " + newLine);
        startTime();
        for(char iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(float[] arr, boolean newLine){
        if(test) System.out.println("float arr " + newLine);
        startTime();
        for(float iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static void print(double[] arr, boolean newLine){
        if(test) System.out.println("double arr " + newLine);
        startTime();
        for(double iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    private static <T> void printArray(T[] arr, boolean newLine){
        if(test) System.out.println("T " + arr.getClass().getSimpleName() + " " + newLine);
        startTime();
        for(T iter : arr){
            System.out.print(iter + " ");
            if(newLine){
                System.out.println();
            }
        }
        printExecutionTime();
    }

    public static <T> void print(T var, boolean newLine){
        if(test) System.out.print("T nl ");
        if(!isNull(var)){
            if(var.getClass().isArray()){
                if(var instanceof short[]){
                    print((short[])var, newLine);
                }else if(var instanceof int[]){
                    print((int[])var, newLine);
                }else if(var instanceof byte[]){
                    print((byte[])var, newLine);
                }else if(var instanceof long[]){
                    print((long[])var, newLine);
                }else if(var instanceof float[]){
                    print((float[])var, newLine);
                }else if(var instanceof double[]){
                    print((double[])var, newLine);
                }else if(var instanceof char[]){
                    print((char[])var, newLine);
                }else if(var instanceof boolean[]){
                    print((boolean[])var, newLine);
                }else{
                    printArray((T[])var, newLine);
                }
            }else{
                print(var);
            }
        }
    }

//    private static void print(short var){
//        if(test) System.out.println("short");
//        System.out.println(var);
//    }
//    private static void print(boolean var){
//        if(test) System.out.println("boolean");
//        System.out.println(var);
//    }
//
//    private static void print(int var){
//        if(test) System.out.println("int");
//        System.out.println(var);
//    }
//
//    private static void print(byte var){
//        if(test) System.out.println("byte");
//        System.out.println(var);
//    }
//
//    private static void print(long var){
//        if(test) System.out.println("long");
//        System.out.println(var);
//    }
//
//    private static void print(float var){
//        if(test) System.out.println("float");
//        System.out.println(var);
//    }
//
//    private static void print(double var){
//        if(test) System.out.println("double");
//        System.out.println(var);
//    }
//
//    private static void print(char var){
//        if(test) System.out.println("char");
//        System.out.println(var);
//    }

    public static <T> void print(T var){
        if(test) System.out.print("T ");
        if(!isNull(var)){
            if(var.getClass().isArray()){
                print(var, false);
            }else{
                if(test) System.out.println(var.getClass().getSimpleName());
                startTime();
                System.out.print(var);
                printExecutionTime();
            }
        }
    }

    private static <T> boolean isNull(T var){
        if(var == null){
            System.out.println("Is null");
            return true;
        }
        return false;
    }

    public static <T> void print(List<T> list){
        if(test) System.out.println("List<T>");
        if(!isNull(list)){
            startTime();
            if(list.isEmpty()){
                System.out.println("Is empty");
            }else{
                for(T iter : list){
                    System.out.print(iter + " ");
                }
            }
            printExecutionTime();
        }
    }

    public static void printNodeLinkedList(Node root){
        if(!isNull(root)){
            startTime();
            if(root.getRight() != null){
                while(root != null){
                    System.out.print(root.getData() + " ");
                    root = root.getRight();
                }
                System.out.println();
            }else{
                while(root != null){
                    System.out.print(root.getData() + " ");
                    root = root.getNext();
                }
            }
            printExecutionTime();
        }
    }

    public static void printInOrder(Node node){
        if(!isNull(node)){
            startTime();
            printInOrderHelper(node);
            printExecutionTime();
        }
    }

    private static void printInOrderHelper(Node node){
        if(node != null){
            printInOrderHelper(node.getPrev());
            System.out.print(node.getData() + " ");
            printInOrderHelper(node.getNext());
        }
    }

    private static void printPreOrderHelper(Node node){
        if(node != null){
            System.out.print(node.getData() + " ");
            printPreOrderHelper(node.getPrev());
            printPreOrderHelper(node.getNext());
        }
    }

    private static void printPostOrderHelper(Node node){
        if(node != null){
            printPostOrderHelper(node.getPrev());
            printPostOrderHelper(node.getNext());
            System.out.print(node.getData() + " ");
        }
    }

    public static void printCircular(Node n){
        if(!isNull(n)){
            startTime();
            System.out.print(n.getData());
            Node trav = n.getNext();
            while(trav != n){
                System.out.print(" " + trav.getData());
                trav = trav.getNext();
            }
            printExecutionTime();
        }
    }

    public static void printPreOrder(Node root){
        if(!isNull(root)){
            startTime();
            printPreOrderHelper(root);
            printExecutionTime();
        }
    }

    public static void printPostOrder(Node root){
        if(!isNull(root)){
            startTime();
            printPostOrderHelper(root);
            printExecutionTime();
        }
    }

    public static void printLevelOrder(Node root){
        if(!isNull(root)){
            startTime();
            printLevelOrderHelper(root);
            printExecutionTime();
        }
    }

    private static void printLevelOrderHelper(Node root){
        if(root == null){
            System.out.println("Empty tree");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.remove();
                if(curr == null){
                    System.out.print("N ");
                }else{
                    System.out.print(curr.getData() + " ");
                    q.add(curr.getLeft());
                    q.add(curr.getRight());
                }
            }
            System.out.println();
        }
    }

    public static void printBinaryTree(Node root){
        if(!isNull(root)){
            printLevelOrder(root);
        }
    }

    public static void printRandomTree(Tree root){
        if(!isNull(root)){
            startTime();
            Queue<Tree> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Tree curr = q.remove();
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                    System.out.print(curr.left.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.right != null){
                    q.add(curr.right);
                    System.out.print(curr.right.data + " ");
                }else{
                    System.out.print("N ");
                }
                if(curr.random != null){
                    System.out.print(curr.random.data);
                }else{
                    System.out.print("N ");
                }
                System.out.println();
            }
            printExecutionTime();
        }
    }

    public static <T> void print(T[] arr, boolean newLine){
        if(!isNull(arr)){
            startTime();
            if(newLine){
                for(T iter : arr){
                    System.out.println(iter.toString());
                }
            }else{
                for(T iter : arr){
                    System.out.print(iter.toString() + " ");
                }
            }
            printExecutionTime();
        }
    }

    public static void print(int[][] matrix){
        if(test) System.out.println("int matrix");
        if(!isNull(matrix)){
            startTime();
            for(int[] outer : matrix){
                for(int in : outer){
                    System.out.print(in + " ");
                }
                System.out.println();
            }
            printExecutionTime();
        }
    }

    public static <T> void print(T[][] matrix){
        if(test) System.out.println("T matrix");
        if(!isNull(matrix)){
            startTime();
            for(T[] outer : matrix){
                for(T in : outer){
                    System.out.print(in + " ");
                }
                System.out.println();
            }
            printExecutionTime();
        }
    }

    public static <T> void print(Set<T> set){
        if(test) System.out.println("Set<T>");
        if(!isNull(set)){
            startTime();
            for(T iter : set){
                System.out.print(iter + " ");
            }
            printExecutionTime();
        }
    }

    public static void printListNode(ListNode listnode){
        if(!isNull(listnode)){
            startTime();
            while(listnode != null){
                System.out.print(listnode.val + " ");
                listnode = listnode.getNext();
            }
            printExecutionTime();
        }
    }

    public static void printBinaryTree(TreeNode treenode, boolean inLine){
        if(!isNull(treenode)){
            startTime();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(treenode);
            while(!q.isEmpty()){
                int size = q.size();
                for(int i = 0; i < size; i++){
                    TreeNode curr = q.remove();
                    if(curr == null){
                        System.out.print("N ");
                    }else{
                        System.out.print(curr.val + " ");
                        if(curr.left != null || curr.right != null){
                            q.add(curr.left);
                            q.add(curr.right);
                        }
                    }
                }
                if(!inLine){
                    System.out.println();
                }
            }
            printExecutionTime();
        }
    }

    public static void printNode(Node middleNode){
        startTime();
        if(!isNull(middleNode)){
            System.out.print(middleNode.getData());
        }
        printExecutionTime();
    }
}
