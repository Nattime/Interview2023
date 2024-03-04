package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest{
    private static RemoveNthNodeFromEndOfList test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new RemoveNthNodeFromEndOfList();
    }

    @Test
    void TestCase1(){
        ListNode list = Create.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode output = Create.createListNode(new int[]{1, 2, 3, 5});
        assertEquals(test.removeNthFromEnd(list, 2), output);
    }

    @Test
    void TestCase2(){
        ListNode list = Create.createListNode(new int[]{1});
        ListNode output = Create.createListNode(new int[]{});
        assertEquals(test.removeNthFromEnd(list, 1), output);
    }

    @Test
    void TestCase3(){
        ListNode list = Create.createListNode(new int[]{1, 2});
        ListNode output = Create.createListNode(new int[]{1});
        assertEquals(test.removeNthFromEnd(list, 1), output);
    }

    @Test
    void TestCase4(){
        ListNode list = Create.createListNode(new int[]{1, 2});
        ListNode output = Create.createListNode(new int[]{2});
        assertEquals(test.removeNthFromEnd(list, 2), output);
    }
}