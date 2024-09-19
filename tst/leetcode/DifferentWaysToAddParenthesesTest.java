package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DifferentWaysToAddParenthesesTest{
    private static DifferentWaysToAddParentheses test;

    @BeforeAll
    static void beforeAll(){
        test = new DifferentWaysToAddParentheses();
    }

    @Test
    @DisplayName("test_diffWaysToCompute_case1")
    void test_diffWaysToCompute_case1(){
        List<Integer> input = test.diffWaysToCompute("2-1-1");
        List<Integer> output = Arrays.asList(0, 2);
        assertEquals(input.size(), output.size());
        assertTrue(input.containsAll(output));
        assertTrue(output.containsAll(input));
    }

    @Test
    @DisplayName("test_diffWaysToCompute_case2")
    void test_diffWaysToCompute_case2(){
        List<Integer> input = test.diffWaysToCompute("2*3-4*5");
        List<Integer> output = Arrays.asList(-34, -14, -10, -10, 10);
        assertEquals(input.size(), output.size());
        assertTrue(input.containsAll(output));
        assertTrue(output.containsAll(input));
    }
}