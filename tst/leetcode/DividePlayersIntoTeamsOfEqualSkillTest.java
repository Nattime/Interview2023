package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DividePlayersIntoTeamsOfEqualSkillTest{
    private static DividePlayersIntoTeamsOfEqualSkill test;

    @BeforeAll
    static void beforeAll(){
        test = new DividePlayersIntoTeamsOfEqualSkill();
    }

    @Test
    @DisplayName("test_dividePlayers_case1")
    void test_dividePlayers_case1(){
        assertEquals(test.dividePlayers(new int[]{3, 2, 5, 1, 3, 4}), 22L);
    }

    @Test
    @DisplayName("test_dividePlayers_case2")
    void test_dividePlayers_case2(){
        assertEquals(test.dividePlayers(new int[]{3, 4}), 12L);
    }

    @Test
    @DisplayName("test_dividePlayers_case3")
    void test_dividePlayers_case3(){
        assertEquals(test.dividePlayers(new int[]{1, 1, 2, 3}), -1L);
    }
}