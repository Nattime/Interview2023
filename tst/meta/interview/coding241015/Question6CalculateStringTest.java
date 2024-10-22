package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question6CalculateStringTest{
    private static Question6CalculateString test;

    @BeforeAll
    static void beforeAll(){
        test = new Question6CalculateString();
    }

    @Test
    @DisplayName("test_compute_case1")
    void test_compute_case1(){
        assertEquals(test.compute("2*3+4"), "10");
    }

    @Test
    @DisplayName("test_compute_case2")
    void test_compute_case2(){
        assertEquals(test.compute("4+2*3*2+4"), "20");
    }

    @Test
    @DisplayName("test_compute_case3")
    void test_compute_case3(){
//        assertEquals(test.compute(""), );
    }
}