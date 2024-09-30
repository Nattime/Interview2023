package amazon.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question240930Test{
    private static Question240930 test;

    @BeforeAll
    static void beforeAll(){
        test = new Question240930();
    }

    @Test
    @DisplayName("test_solution_case1")
    void test_solution_case1(){
        List<Integer> input = List.of(10, 5, 6, 7, 3, 8, 9, 2);
        assertEquals(test.solution(input), 10);
    }

    @Test
    @DisplayName("test_solution_case2")
    void test_solution_case2(){
        List<Integer> input = List.of(10, 5);
        assertEquals(test.solution(input), 0);
    }

    @Test
    @DisplayName("test_solution_case3")
    void test_solution_case3(){
        List<Integer> input = List.of(3, 8, 4, 8);
        assertEquals(test.solution(input), 9);
    }

    @Test
    @DisplayName("test_solution_case4")
    void test_solution_case4(){
        List<Integer> input = List.of(8, 8, 4, 3);
        assertEquals(test.solution(input), 0);
    }
}