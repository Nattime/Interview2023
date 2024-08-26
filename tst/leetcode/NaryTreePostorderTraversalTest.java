package leetcode;

import com.resources.Create;
import com.resources.NaryNode;
import com.resources.Print;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaryTreePostorderTraversalTest{
    private static NaryTreePostorderTraversal test;

    @BeforeAll
    static void beforeAll(){
        test = new NaryTreePostorderTraversal();
    }

    @Test
    @DisplayName("test_postorder_case1")
    void test_postorder_case1(){
        NaryNode input = Create.createNaryTree(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
        Print.print(input);
        List<Integer> list = List.of(5, 6, 3, 2, 4, 1);
        assertEquals(test.postorder(input), list);
    }

    @Test
    @DisplayName("test_postorder_case2")
    void test_postorder_case2(){
        NaryNode input = Create.createNaryTree(new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14});
        List<Integer> list = List.of(2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1);
        assertEquals(test.postorder(input), list);
    }
}