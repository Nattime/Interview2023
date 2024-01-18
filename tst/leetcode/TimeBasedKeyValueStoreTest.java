package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TimeBasedKeyValueStoreTest{
    private static TimeBasedKeyValueStore test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new TimeBasedKeyValueStore();
    }

    @Test
    void TestCase1(){
        String[] arr = {"TimeMap", "set", "get", "get", "set", "get", "get"};
        String[][] mat = {{}, {"foo", "bar", "1"}, {"foo", "1"}, {"foo", "3"}, {"foo", "bar2", "4"}, {"foo", "4"}, {"foo", "5"}};
        String[] output = {null, null, "bar", "bar", null, "bar2", "bar2"};
        assertArrayEquals(ret(arr, mat), output);
    }

    String[] ret(String[] arg, String[][] cmd){
        String[] ret = new String[arg.length];
        for(int i = 0; i < arg.length; i++){
            if(arg[i].equals("set")){
                test.set(cmd[i][0], cmd[i][1], Integer.parseInt(cmd[i][2]));
            }else if(arg[i].equals("get")){
                ret[i] = test.get(cmd[i][0], Integer.parseInt(cmd[i][1]));
            }else{
                test.TimeMap();
            }
        }
        return ret;
    }

    @Test
    void TestCase2(){
    }

    @Test
    void TestCase3(){
    }
}