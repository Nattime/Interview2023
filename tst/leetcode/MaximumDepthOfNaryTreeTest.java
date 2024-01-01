package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import resources.Create;
import resources.NaryNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfNaryTreeTest{
    private static MaximumDepthOfNaryTree test;

    @BeforeAll
    public static void setUp(){
        test = new MaximumDepthOfNaryTree();
    }

    @Test
    void TestCase1(){
        Integer arr[] = new Integer[]{1, null, 3, 2, 4, null, 5, 6};
        NaryNode head = Create.createNaryTree(arr);
        assertEquals(test.maxDepth(head), 3);
    }

    @Test
    void TestCase2(){
        Integer arr[] = new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14};
        NaryNode head = Create.createNaryTree(arr);
        assertEquals(test.maxDepth(head), 5);
    }

    @Test
    void TestCase3(){
    }
}