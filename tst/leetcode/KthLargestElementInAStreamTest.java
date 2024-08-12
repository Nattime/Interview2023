package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAStreamTest{
    private static KthLargestElementInAStream test;

    @BeforeAll
    static void beforeAll(){
    }

    @Test
    @DisplayName("test_add_case1")
    void test_add_case1(){
        test = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        assertEquals(test.add(3), 4);
        assertEquals(test.add(5), 5);
        assertEquals(test.add(10), 5);
        assertEquals(test.add(9), 8);
        assertEquals(test.add(4), 8);
    }
}