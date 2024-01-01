package resources;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreateTest{
    private static Create test;

    @BeforeAll
    static void beforeAll(){
        test = new Create();
    }

    @Test
    void testNaryTree(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null, 3, 2, 4, null, 5, 6});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase2(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase3(){
        NaryNode head = Create.createNaryTree(new Integer[]{1});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase4(){
        NaryNode head = Create.createNaryTree(new Integer[]{1, null});
        Print.print(head);
    }

    @Test
    void testNaryTreeTestCase5(){
        NaryNode head = Create.createNaryTree(null);
        Print.print(head);
    }
}