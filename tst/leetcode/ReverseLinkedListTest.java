package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest{
    private static ReverseLinkedList test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new ReverseLinkedList();
    }

    @Test
    void TestCase1(){
        ListNode root = Create.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode valid = Create.createListNode(new int[]{5, 4, 3, 2, 1});
        assertEquals(test.reverseList(root), valid);
    }

    @Test
    void TestCase2(){
        ListNode root = Create.createListNode(new int[]{1, 2});
        ListNode valid = Create.createListNode(new int[]{2, 1});
        assertEquals(test.reverseList(root), valid);
    }

    @Test
    void TestCase3(){
        ListNode root = Create.createListNode(new int[]{});
        ListNode valid = Create.createListNode(new int[]{});
        assertEquals(test.reverseList(root), valid);
    }
}