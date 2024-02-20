package resources;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CreateTest{
    private static Create test;

    @BeforeAll
    static void beforeAll(){
        test = new Create();
    }

    @Test
    void testNaryTree(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase2(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase3(){
        NaryNode head = Create.createNaryTree(new Integer[]{1});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase4(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase5(){
        NaryNode head = Create.createNaryTree(null);
        Print.print(head);
    }

    @Test
    void testCreateListNodeArray1(){
        int[][] list = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] input = Create.createListNodeArray(list);
        Print.print(input);
        ListNode[] output = new ListNode[3];
        output[0] = Create.createListNode(new int[]{1, 4, 5});
        output[1] = Create.createListNode(new int[]{1, 3, 4});
        output[2] = Create.createListNode(new int[]{2, 6});
        Print.print(output);
        assertArrayEquals(input, output);
    }

    @Test
    void testCreateListNodeArray2(){
        int[][] list = {{}};
        ListNode[] input = Create.createListNodeArray(list);
        int[] arr1 = {};
        ListNode[] output = new ListNode[1];
        output[0] = Create.createListNode(arr1);
        assertArrayEquals(input, output);
    }

    @Test
    void testCreateListNodeArray3(){
        int[][] list = {};
        ListNode[] input = Create.createListNodeArray(list);
        ListNode[] output = new ListNode[0];
        assertArrayEquals(input, output);
    }
}