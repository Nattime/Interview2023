package meta;

import com.resources.Create;
import com.resources.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ReverseOperationsTest{
    private static ReverseOperations test;

    @BeforeAll
    static void beforeAll(){
        test = new ReverseOperations();
    }

    @Test
    @DisplayName("test_reverse_case1")
    void test_reverse_case1(){
        Node input = Create.createNodeLinkedList(new int[]{1, 8, 2, 9, 16, 12});
        Node expected = Create.createNodeLinkedList(new int[]{1, 2, 8, 9, 12, 16});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_case2")
    void test_reverse_case2(){
        Node input = Create.createNodeLinkedList(new int[]{2, 18, 24, 3, 5, 7, 9, 6, 12});
        Node expected = Create.createNodeLinkedList(new int[]{24, 18, 2, 3, 5, 7, 9, 12, 6});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_case3")
    void test_reverse_case3(){
        Node input = Create.createNodeLinkedList(new int[]{2, 18, 24});
        Node expected = Create.createNodeLinkedList(new int[]{24, 18, 2});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_case4")
    void test_reverse_case4(){
        Node input = Create.createNodeLinkedList(new int[]{2});
        Node expected = Create.createNodeLinkedList(new int[]{2});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_case5")
    void test_reverse_case5(){
        Node input = Create.createNodeLinkedList(new int[]{1});
        Node expected = Create.createNodeLinkedList(new int[]{1});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_case6")
    void test_reverse_case6(){
        Node input = Create.createNodeLinkedList(new int[]{});
        Node expected = Create.createNodeLinkedList(new int[]{});
        assertEquals(test.reverse(input), expected);
    }

    @Test
    @DisplayName("test_reverse_false")
    void test_reverse_false(){
        Node input = Create.createNodeLinkedList(new int[]{2, 18, 24});
        Node expected = Create.createNodeLinkedList(new int[]{24, 18, 1});
        assertNotEquals(test.reverse(input), expected);
    }
}