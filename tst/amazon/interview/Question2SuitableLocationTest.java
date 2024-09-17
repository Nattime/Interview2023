package amazon.interview;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2SuitableLocationTest{
    private static Question2SuitableLocation test;

    @BeforeAll
    static void beforeAll(){
        test = new Question2SuitableLocation();
    }

    @Test
    @DisplayName("test_suitableLocation_case1")
    void test_suitableLocation_case1(){
        List<Integer> list = Arrays.asList(-2, 1, 0);
        assertEquals(test.suitableLocation(list, 8), 3);
    }

    @Test
    @DisplayName("test_suitableLocation_case2")
    void test_suitableLocation_case2(){
        List<Integer> list = Arrays.asList(2, 0, 3, -4);
        assertEquals(test.suitableLocation(list, 22), 5);
    }
}