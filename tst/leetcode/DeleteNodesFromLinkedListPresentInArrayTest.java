package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodesFromLinkedListPresentInArrayTest{
    private static DeleteNodesFromLinkedListPresentInArray test;

    @BeforeAll
    static void beforeAll(){
        test = new DeleteNodesFromLinkedListPresentInArray();
    }

    @Test
    @DisplayName("test_modifiedList_case1")
    void test_modifiedList_case1(){
        ListNode root = Create.createListNode(new int[]{1, 2, 3, 4, 5});
        ListNode expected = Create.createListNode(new int[]{4, 5});
        assertEquals(test.modifiedList(new int[]{1, 2, 3}, root), expected);
    }

    @Test
    @DisplayName("test_modifiedList_case2")
    void test_modifiedList_case2(){
        ListNode root = Create.createListNode(new int[]{1, 2, 1, 2, 1, 2});
        ListNode expected = Create.createListNode(new int[]{2, 2, 2});
        assertEquals(test.modifiedList(new int[]{1}, root), expected);
    }

    @Test
    @DisplayName("test_modifiedList_case3")
    void test_modifiedList_case3(){
        ListNode root = Create.createListNode(new int[]{1, 2, 3, 4});
        ListNode expected = Create.createListNode(new int[]{1, 2, 3, 4});
        assertEquals(test.modifiedList(new int[]{5}, root), expected);
    }
}