package leetcode;

import com.resources.Create;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AllAncestorsOfANodeInADirectedAcyclicGraphTest{
    private static AllAncestorsOfANodeInADirectedAcyclicGraph test;
    
    @BeforeAll
    static void beforeAll(){
        test = new AllAncestorsOfANodeInADirectedAcyclicGraph();
    }
    
    @Test
    @DisplayName("test_getAncestors_case1")
    void test_getAncestors_case1(){
        List<List<Integer>> output = Create.createListList(new int[][]{{}, {}, {}, {0, 1}, {0, 2}, {0, 1, 3}, {0, 1, 2, 3, 4}, {0, 1, 2, 3}});
        assertEquals(test.getAncestors(8, new int[][]{{0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}}), output);
    }
    
    @Test
    @DisplayName("test_getAncestors_case2")
    void test_getAncestors_case2(){
        List<List<Integer>> output = Create.createListList(new int[][]{{}, {0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}});
        assertEquals(test.getAncestors(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}}), output);
    }
}