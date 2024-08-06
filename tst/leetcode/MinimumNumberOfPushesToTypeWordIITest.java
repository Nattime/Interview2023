package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfPushesToTypeWordIITest{
    private static MinimumNumberOfPushesToTypeWordII test;

    @BeforeAll
    static void beforeAll(){
        test = new MinimumNumberOfPushesToTypeWordII();
    }

    @Test
    @DisplayName("test_minimumPushes_case1")
    void test_minimumPushes_case1(){
        assertEquals(test.minimumPushes("abcde"), 5);
    }

    @Test
    @DisplayName("test_minimumPushes_case2")
    void test_minimumPushes_case2(){
        assertEquals(test.minimumPushes("xyzxyzxyzxyz"), 12);
    }

    @Test
    @DisplayName("test_minimumPushes_case3")
    void test_minimumPushes_case3(){
        assertEquals(test.minimumPushes("aabbccddeeffgghhiiiiii"), 24);
    }

    @Test
    @DisplayName("test_minimumPushes_case4")
    void test_minimumPushes_case4(){
        assertEquals(test.minimumPushes("alporfmdqsbhncwyu"), 27);
    }
}