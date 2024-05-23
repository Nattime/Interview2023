package leetcode;

import com.resources.Create;
import com.resources.TreeNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCompleteTreeNodesTest {
    private static CountCompleteTreeNodes test;
    private TreeNode head;

    @BeforeAll
    static void setUp() {
        test = new CountCompleteTreeNodes();
    }

    @BeforeEach
    void before() {
        head = null;
    }

    @Test
    void TestCase1() {
        head = Create.createTreeNodeTree(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(test.countNodes(head), 6);
    }

    @Test
    void TestCase2() {
        assertEquals(test.countNodes(head), 0);
    }

    @Test
    void TestCase3() {
        head = Create.createTreeNodeTree(new int[]{1});
        assertEquals(test.countNodes(head), 1);
    }
}