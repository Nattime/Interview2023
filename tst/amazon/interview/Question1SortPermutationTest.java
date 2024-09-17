package amazon.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1SortPermutationTest{
    private static Question1SortPermutation test;

    @BeforeAll
    static void beforeAll(){
        test = new Question1SortPermutation();
    }

    @Test
    @DisplayName("test_sortPermutation_case1")
    void test_sortPermutation_case1(){
        List<Integer> p = Arrays.asList(2, 3, 1, 4);
        List<Integer> moves = Arrays.asList(2, 3);
        assertEquals(test.sortPermutation(p, moves), "10");
    }

    @Test
    @DisplayName("test_sortPermutation_case2")
    void test_sortPermutation_case2(){
        List<Integer> p = Arrays.asList(2, 3, 1, 4, 5);
        List<Integer> moves = Arrays.asList(1, 5, 2);
        assertEquals(test.sortPermutation(p, moves), "001");
    }
}