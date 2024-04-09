package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeNeededToBuyTicketsTest{
    private static TimeNeededToBuyTickets test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new TimeNeededToBuyTickets();
    }

    @Test
    void TestCase1(){
        assertEquals(test.timeRequiredToBuy(new int[]{2, 3, 2}, 2), 6);
    }

    @Test
    void TestCase2(){
        assertEquals(test.timeRequiredToBuy(new int[]{5, 1, 1, 1}, 0), 8);
    }

    @Test
    void TestCase3(){
        assertEquals(test.timeRequiredToBuy(new int[]{84, 49, 5, 24, 70, 77, 87, 8}, 3), 154);
    }
}