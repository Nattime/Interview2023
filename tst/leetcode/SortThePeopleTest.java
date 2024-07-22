package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortThePeopleTest{
    private static SortThePeople test;
    
    @BeforeAll
    static void beforeAll(){
        test = new SortThePeople();
    }
    
    @Test
    @DisplayName("test_sortPeople_case1")
    void test_sortPeople_case1(){
        assertArrayEquals(test.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}), new String[]{"Mary", "Emma", "John"});
    }
    
    @Test
    @DisplayName("test_sortPeople_case2")
    void test_sortPeople_case2(){
        assertArrayEquals(test.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}), new String[]{"Bob", "Alice", "Bob"});
    }
}