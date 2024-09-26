package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCalendarITest{
    private static MyCalendarI test;

    @BeforeAll
    static void beforeAll(){
        test = new MyCalendarI();
    }

    @Test
    @DisplayName("test_book_case1")
    void test_book_case1(){
        MyCalendarI.MyCalendar cal = new MyCalendarI.MyCalendar();
        int[][] mat = new int[][]{{10, 20}, {15, 25}, {20, 30}};
        boolean[] expected = new boolean[]{true, false, true};
        int i = 0;
        for(int[] iter : mat){
            assertEquals(cal.book(iter[0], iter[1]), expected[i++]);
        }
    }

    @Test
    @DisplayName("test_book_case2")
    void test_book_case2(){

    }
}