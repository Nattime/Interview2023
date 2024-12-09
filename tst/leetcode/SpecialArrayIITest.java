package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SpecialArrayIITest{
    private static SpecialArrayII test;

    @BeforeAll
    static void beforeAll(){
        test = new SpecialArrayII();
    }

    @Test
    @DisplayName("test_isArraySpecial_case1")
    void test_isArraySpecial_case1(){
        assertArrayEquals(new boolean[]{false}, test.isArraySpecial(new int[]{3, 4, 1, 2, 6}, new int[][]{{0, 4}}));
    }

    @Test
    @DisplayName("test_isArraySpecial_case2")
    void test_isArraySpecial_case2(){
        assertArrayEquals(new boolean[]{false, true}, test.isArraySpecial(new int[]{4, 3, 1, 6}, new int[][]{{0, 2}, {2, 3}}));
    }
}