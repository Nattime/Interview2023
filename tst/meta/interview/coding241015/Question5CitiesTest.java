package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question5CitiesTest{
    private static Question5Cities test;

    @BeforeAll
    static void beforeAll(){
        test = new Question5Cities();
    }


    // TODO need a way to test for percentage

    @Test
    @DisplayName("test_getCity_case1")
    void test_getCity_case1(){
        assertEquals(test.getCity(new String[]{"NYC", "LAS", "SEA"}, new long[]{7_000_001L, 5_000_000L, 8_000_000L}), "NYC");
    }

    @Test
    @DisplayName("test_getCity_case2")
    void test_getCity_case2(){
//        assertEquals(test.getCity(new String[]{}, new long[]{}), "");
    }

    @Test
    @DisplayName("test_getCity_case3")
    void test_getCity_case3(){
//        assertEquals(test.getCity(new String[]{}, new long[]{}), "");
    }
}