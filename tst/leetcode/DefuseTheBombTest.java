package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DefuseTheBombTest{
    private static DefuseTheBomb test;

    @BeforeAll
    static void beforeAll(){
        test = new DefuseTheBomb();
    }

    @Test
    @DisplayName("test_decrypt_case1")
    void test_decrypt_case1(){
        assertArrayEquals(new int[]{12, 10, 16, 13}, test.decrypt(new int[]{5, 7, 1, 4}, 3));
    }

    @Test
    @DisplayName("test_decrypt_case2")
    void test_decrypt_case2(){
        assertArrayEquals(new int[]{0, 0, 0, 0}, test.decrypt(new int[]{1, 2, 3, 4}, 0));
    }

    @Test
    @DisplayName("test_decrypt_case3")
    void test_decrypt_case3(){
        assertArrayEquals(new int[]{12, 5, 6, 13}, test.decrypt(new int[]{2, 4, 9, 3}, -2));
    }
}