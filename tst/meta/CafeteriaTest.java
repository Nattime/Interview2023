package meta;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CafeteriaTest{
    private static Cafeteria test;

    @BeforeAll
    static void beforeAll(){
        test = new Cafeteria();
    }

    @Test
    @DisplayName("test_getMaxAdditionalDinersCount_case1")
    void test_getMaxAdditionalDinersCount_case1(){
        assertEquals(test.getMaxAdditionalDinersCount(10, 1, 2, new long[]{2, 6}), 3);
    }

    @Test
    @DisplayName("test_getMaxAdditionalDinersCount_case2")
    void test_getMaxAdditionalDinersCount_case2(){
        assertEquals(test.getMaxAdditionalDinersCount(15, 2, 3, new long[]{11, 6, 14}), 1);
    }
}