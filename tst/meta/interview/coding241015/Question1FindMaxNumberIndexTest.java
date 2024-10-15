package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Question1FindMaxNumberIndexTest{
    private static Question1FindMaxNumberIndex test;

    @BeforeAll
    static void beforeAll(){
        test = new Question1FindMaxNumberIndex();
    }

    @Test
    @DisplayName("test_findMaxIndex_case1")
    void test_findMaxIndex_case1(){
        List<Integer> expected = List.of(3, 5);
        int output = test.findMaxIndex(new int[]{2, 1, -1, 6, 0, 6});
        assertTrue(expected.contains(output));
    }

    @Test
    @DisplayName("test_findMaxIndex_case2")
    void test_findMaxIndex_case2(){
        int output = test.findMaxIndex(new int[]{});
        assertEquals(output, -1);
    }

    @Test
    @DisplayName("test_findMaxIndex_case3")
    void test_findMaxIndex_case3(){
        List<Integer> expected = List.of(0);
        int output = test.findMaxIndex(new int[]{2, 1, -1, 0});
        assertTrue(expected.contains(output));
    }
}