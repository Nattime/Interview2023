package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DesignCircularDequeTest{
    private static DesignCircularDeque test;

    @BeforeAll
    static void beforeAll(){
        test = new DesignCircularDeque();
    }

    private String[] getOutput(String[] commands, int[] input, int size){
        DesignCircularDeque.MyCircularDeque deque = new DesignCircularDeque.MyCircularDeque(size);
        String[] ret = new String[commands.length];
        for(int i = 0; i < commands.length; i++){
            StringBuilder str = new StringBuilder();
            if(commands[i].equals("insertLast")){
                str.append(deque.insertLast(input[i]));
            }else if(commands[i].equals("insertFront")){
                str.append(deque.insertFront(input[i]));
            }else if(commands[i].equals("getRear")){
                str.append(deque.getRear());
            }else if(commands[i].equals("getFront")){
                str.append(deque.getFront());
            }else if(commands[i].equals("deleteFront")){
                str.append(deque.deleteFront());
            }else if(commands[i].equals("deleteLast")){
                str.append(deque.deleteLast());
            }else if(commands[i].equals("isEmpty")){
                str.append(deque.isEmpty());
            }else if(commands[i].equals("isFull")){
                str.append(deque.isFull());
            }
            ret[i] = str.toString();
        }
        return ret;
    }

    @Test
    @DisplayName("test_valid_case1")
    void test_valid_case1(){
        int size = 3;
        String[] commands = new String[]{"insertLast", "insertLast", "insertFront", "insertFront", "getRear", "isFull", "deleteLast", "insertFront", "getFront"};
        int[] arr = new int[]{1, 2, 3, 4, -1, -1, -1, 4, -1};
        String[] expected = new String[]{"true", "true", "true", "false", "2", "true", "true", "true", "4"};
        assertArrayEquals(getOutput(commands, arr, size), expected);
    }
}