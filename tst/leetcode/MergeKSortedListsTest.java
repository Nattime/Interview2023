package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeKSortedListsTest{
    private static MergeKSortedLists test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MergeKSortedLists();
    }

    @Test
    void TestCase1(){
        int[][] list = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ListNode[] input = Create.createListNodeArray(list);
        ListNode output = Create.createListNode(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(test.mergeKLists(input), output);
    }

    @Test
    void TestCase2(){
        int[][] list = {};
        ListNode[] input = Create.createListNodeArray(list);
        ListNode output = Create.createListNode(new int[]{});
        assertEquals(test.mergeKLists(input), output);
    }

    @Test
    void TestCase3(){
        int[][] list = {{}};
        ListNode[] input = Create.createListNodeArray(list);
        ListNode output = Create.createListNode(new int[]{});
        assertEquals(test.mergeKLists(input), output);
    }

    @Test
    void TestCase4(){
        int[][] list = {{-2, -1, -1, -1}, {}};
        ListNode[] input = Create.createListNodeArray(list);
        ListNode output = Create.createListNode(new int[]{-2, -1, -1, -1});
        assertEquals(test.mergeKLists(input), output);
    }
}