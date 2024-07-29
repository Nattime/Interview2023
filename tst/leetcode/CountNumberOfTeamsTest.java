package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumberOfTeamsTest{
    private static CountNumberOfTeams test;
    
    @BeforeAll
    static void beforeAll(){
        test = new CountNumberOfTeams();
    }
    
    @Test
    @DisplayName("test_numTeams_case1")
    void test_numTeams_case1(){
        assertEquals(test.numTeams(new int[]{2, 5, 3, 4, 1}), 3);
    }
    
    @Test
    @DisplayName("test_numTeams_case2")
    void test_numTeams_case2(){
        assertEquals(test.numTeams(new int[]{2, 1, 3}), 0);
    }
    
    @Test
    @DisplayName("test_numTeams_case3")
    void test_numTeams_case3(){
        assertEquals(test.numTeams(new int[]{1, 2, 3, 4}), 4);
    }
}