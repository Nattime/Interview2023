package leetcode;

import com.resources.Create;
import com.resources.ListNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPointsTest{
    private static FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints test;
    
    @BeforeAll
    static void beforeAll(){
        test = new FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints();
    }
    
    @Test
    @DisplayName("test_nodesBetweenCriticalPoints_case1")
    void test_nodesBetweenCriticalPoints_case1(){
        ListNode input = Create.createListNode(new int[]{3, 1});
        assertArrayEquals(test.nodesBetweenCriticalPoints(input), new int[]{-1, -1});
    }
    
    @Test
    @DisplayName("test_nodesBetweenCriticalPoints_case2")
    void test_nodesBetweenCriticalPoints_case2(){
        ListNode input = Create.createListNode(new int[]{5, 3, 1, 2, 5, 1, 2});
        assertArrayEquals(test.nodesBetweenCriticalPoints(input), new int[]{1, 3});
    }
    
    @Test
    @DisplayName("test_nodesBetweenCriticalPoints_case3")
    void test_nodesBetweenCriticalPoints_case3(){
        ListNode input = Create.createListNode(new int[]{1, 3, 2, 2, 3, 2, 2, 2, 7});
        assertArrayEquals(test.nodesBetweenCriticalPoints(input), new int[]{3, 3});
    }
}