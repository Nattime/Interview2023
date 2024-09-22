package ukg;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PrintLowestDifferenceTest{
    private static PrintLowestDifference test;

    @BeforeAll
    static void beforeAll(){
        test = new PrintLowestDifference();
    }

    @Test
    @DisplayName("test_printLowestPair_case1")
    void test_printLowestPair_case1(){
        List<Integer> input = Arrays.asList(-7, 3, 6, 0);
        test.printLowestPair(input);
    }

    @Test
    @DisplayName("test_printLowestPair_case2")
    void test_printLowestPair_case2(){
        List<Integer> input = Arrays.asList(2, 6, 4, 0, -3, 8);
        test.printLowestPair(input);
    }

    @Test
    @DisplayName("test_printLowestPair_case3")
    void test_printLowestPair_case3(){

    }
}