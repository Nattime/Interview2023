package meta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniformIntegersTest{
    private static UniformIntegers test;

    @BeforeAll
    static void beforeAll(){
        test = new UniformIntegers();
    }

    @Test
    @DisplayName("test_getUniformIntegerCountInInterval_case1")
    void test_getUniformIntegerCountInInterval_case1(){
        assertEquals(test.getUniformIntegerCountInInterval(75L, 300L), 5);
    }

    @Test
    @DisplayName("test_getUniformIntegerCountInInterval_case2")
    void test_getUniformIntegerCountInInterval_case2(){
        assertEquals(test.getUniformIntegerCountInInterval(1L, 9L), 9);
    }

    @Test
    @DisplayName("test_getUniformIntegerCountInInterval_case3")
    void test_getUniformIntegerCountInInterval_case3(){
        assertEquals(test.getUniformIntegerCountInInterval(999_999_999_999L, 999_999_999_999L), 1);
    }
}