package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeInALinkedListTest{
    private static DeleteNodeInALinkedList test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new DeleteNodeInALinkedList();
    }

    @Test
    void TestCase1(){
        int[] arr = {4, 5, 1, 9};
        ListNode list = Create.createListNode(arr);
        ListNode node = list.next;
        test.deleteNode(node);
        int[] arr2 = {4, 1, 9};
        ListNode expected = Create.createListNode(arr2);
        assertEquals(list, expected);
    }

    @Test
    void TestCase2(){
        int[] arr = {4, 5, 1, 9};
        ListNode list = Create.createListNode(arr);
        ListNode node = list.next.next;
        test.deleteNode(node);
        int[] arr2 = {4, 5, 9};
        ListNode expected = Create.createListNode(arr2);
        assertEquals(list, expected);
    }

    @Test
    void TestCase3(){
    }
}