package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertGreatestCommonDivisorsInLinkedListTest{
    private static InsertGreatestCommonDivisorsInLinkedList test;

    @BeforeAll
    static void beforeAll(){
        test = new InsertGreatestCommonDivisorsInLinkedList();
    }

    @Test
    @DisplayName("test_insertGreatestCommonDivisors_case1")
    void test_insertGreatestCommonDivisors_case1(){
        ListNode input = Create.createListNode(new int[]{18, 6, 10, 3});
        ListNode expected = Create.createListNode(new int[]{18, 6, 6, 2, 10, 1, 3});
        assertEquals(test.insertGreatestCommonDivisors(input), expected);
    }

    @Test
    @DisplayName("test_insertGreatestCommonDivisors_case2")
    void test_insertGreatestCommonDivisors_case2(){
        ListNode input = Create.createListNode(new int[]{7});
        ListNode expected = Create.createListNode(new int[]{7});
        assertEquals(test.insertGreatestCommonDivisors(input), expected);
    }
}