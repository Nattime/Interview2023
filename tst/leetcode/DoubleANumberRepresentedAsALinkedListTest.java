package leetcode;

import org.junit.jupiter.api.Test;
import resources.Create;
import resources.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleANumberRepresentedAsALinkedListTest{
    private static DoubleANumberRepresentedAsALinkedList test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new DoubleANumberRepresentedAsALinkedList();
    }

    @Test
    void TestCase1(){
        ListNode output = Create.createListNode(new int[]{1, 8, 9});
        ListNode expected = Create.createListNode(new int[]{3, 7, 8});
        assertEquals(test.doubleIt(output), expected);
    }

    @Test
    void TestCase2(){
        ListNode output = Create.createListNode(new int[]{9, 9, 9});
        ListNode expected = Create.createListNode(new int[]{1, 9, 9, 8});
        assertEquals(test.doubleIt(output), expected);
    }

    @Test
    void TestCase3(){
    }
}