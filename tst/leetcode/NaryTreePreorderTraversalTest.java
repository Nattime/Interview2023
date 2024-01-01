package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import resources.Create;
import resources.NaryNode;
import resources.Print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaryTreePreorderTraversalTest{
    private static NaryTreePreorderTraversal test;

    @BeforeAll
    public static void setUp(){
        test = new NaryTreePreorderTraversal();
    }

    @BeforeEach
    void before(){
        test.list = new ArrayList<>();
    }

    @Test
    void TestCase1(){
        Integer arr[] = new Integer[]{1, null, 3, 2, 4, null, 5, 6};
        NaryNode head = Create.createNaryTree(arr);
        Integer ar[] = new Integer[]{1, 3, 5, 6, 2, 4};
        List<Integer> list = Arrays.asList(ar);
        assertEquals(test.preorder(head), list);
    }

    @Test
    void TestCase2(){
        Integer arr[] = new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14};
        NaryNode head = Create.createNaryTree(arr);
        Integer ar[] = new Integer[]{1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10};
        List<Integer> list = Arrays.asList(ar);
        assertEquals(test.preorder(head), list);
    }

    @Test
    void TestCase3(){
    }
}