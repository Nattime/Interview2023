package flextrade.interview.jan1125;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1Test{
    private static Question1 test;

    @BeforeAll
    static void beforeAll(){
        test = new Question1();
    }

    @Test
    @DisplayName("test_pilesOfBoxes_case1")
    void test_pilesOfBoxes_case1(){
        List<Integer> list = Arrays.asList(5, 2, 1);
        assertEquals(3, test.pilesOfBoxes(list));
    }

    @Test
    @DisplayName("test_pilesOfBoxes_case2")
    void test_pilesOfBoxes_case2(){
        List<Integer> list = Arrays.asList(4, 5, 5, 2, 4);
        assertEquals(6, test.pilesOfBoxes(list));
    }

    @Test
    @DisplayName("test_pilesOfBoxes_case3")
    void test_pilesOfBoxes_case3(){

    }
}