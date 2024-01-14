package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MinStackTest{
    private static MinStack test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinStack();
    }

    @BeforeEach
    void beforeEach(){
        test = new MinStack();
    }

    @Test
    void TestCase1(){
        String[] arr = new String[]{"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"};
        Integer[] vals = new Integer[]{null, -2, 0, -3, null, null, null, null};
        Integer[] expected = new Integer[]{null, null, null, null, -3, null, 0, -2};
        Integer[] ret = execute(arr, vals);
        assertArrayEquals(expected, ret);
    }

    @Test
    void TestCase2(){
    }

    @Test
    void TestCase3(){
    }

    Integer[] execute(String[] arr, Integer[] vals){
        Integer[] ret = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("MinStack")){
                beforeEach();
            }else if(arr[i].equals("push")){
                test.push(vals[i]);
            }else if(arr[i].equals("getMin")){
                ret[i] = test.getMin();
            }else if(arr[i].equals("pop")){
                test.pop();
            }else if(arr[i].equals("top")){
                ret[i] = test.top();
            }
        }

        return ret;
    }
}