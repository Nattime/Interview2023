package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3AddStringTest{
    private static Question3AddString test;

    @BeforeAll
    static void beforeAll(){
        test = new Question3AddString();
    }

    @Test
    @DisplayName("test_add_case1")
    void test_add_case1(){
        assertEquals(test.add("34", "9"), "43");
    }

    @Test
    @DisplayName("test_add_case2")
    void test_add_case2(){
        assertEquals(test.add("100", "0"), "100");
    }

    @Test
    @DisplayName("test_add_case3")
    void test_add_case3(){
        assertEquals(test.add("900", "100"), "1000");
    }

    @Test
    @DisplayName("test_add_case4")
    void test_add_case4(){
        assertEquals(test.add("9999", "1"), "10000");
    }
}