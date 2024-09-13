package meta.interview;

import com.resources.Create;
import com.resources.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintLastTreeNodeTest{
    private static PrintLastTreeNode test;

    @BeforeAll
    static void beforeAll(){
        test = new PrintLastTreeNode();
    }

    @Test
    @DisplayName("test_getLastNodeValues_case1")
    void test_getLastNodeValues_case1(){
        Node root = Create.createBinaryTree(new int[]{6, 2, 3, -1, 5});
        assertEquals(test.getLastNodeValues(root), Arrays.asList(6, 3, 5));
    }

    @Test
    @DisplayName("test_getLastNodeValues_case2")
    void test_getLastNodeValues_case2(){
        Node root = Create.createBinaryTree(new int[]{6, 2, 3, 4, -1, -1, 1, -1, 5});
        assertEquals(test.getLastNodeValues(root), Arrays.asList(6, 3, 1, 5));
    }
}