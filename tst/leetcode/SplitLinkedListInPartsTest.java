package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SplitLinkedListInPartsTest{
    private static SplitLinkedListInParts test;

    @BeforeAll
    static void beforeAll(){
        test = new SplitLinkedListInParts();
    }

    @Test
    @DisplayName("test_splitListToParts_case1")
    void test_splitListToParts_case1(){
        ListNode root = Create.createListNode(new int[]{1, 2, 3});
        ListNode[] expected = Create.createListNodeArray(new int[][]{{1}, {2}, {3}, {}, {}});
        assertArrayEquals(test.splitListToParts(root, 5), expected);
    }

    @Test
    @DisplayName("test_splitListToParts_case2")
    void test_splitListToParts_case2(){
        ListNode root = Create.createListNode(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        ListNode[] expected = Create.createListNodeArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 10}});
        assertArrayEquals(test.splitListToParts(root, 3), expected);
    }
}