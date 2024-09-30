package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DesignAStackWithIncrementOperationTest{
    private static DesignAStackWithIncrementOperation test;

    @BeforeAll
    static void beforeAll(){
        test = new DesignAStackWithIncrementOperation();
    }

    private String[] getOutput(String[] commands, String[] input, int size){
        DesignAStackWithIncrementOperation.CustomStack stack = new DesignAStackWithIncrementOperation.CustomStack(size);
        String[] ret = new String[commands.length];
        for(int i = 0; i < commands.length; i++){
            StringBuilder str = new StringBuilder();
            if(commands[i].equals("push")){
                stack.push(Integer.parseInt(input[i]));
                str.append("null");
            }else if(commands[i].equals("pop")){
                str.append(stack.pop());
            }else if(commands[i].equals("increment")){
                String[] arr = input[i].split(" ");
                stack.increment(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
                str.append("null");
            }
            ret[i] = str.toString();
        }
        return ret;
    }

    @Test
    @DisplayName("test_valid_case1")
    void test_valid_case1(){
        String[] args = new String[]{"push", "push", "pop", "push", "push", "push", "increment", "increment", "pop", "pop", "pop", "pop"};
        String[] input = new String[]{"1", "2", "", "2", "3", "4", "5 100", "2 100", "", "", "", ""};
        String[] expected = new String[]{"null", "null", "2", "null", "null", "null", "null", "null", "103", "202", "201", "-1"};
        assertArrayEquals(getOutput(args, input, 3), expected);
    }
}