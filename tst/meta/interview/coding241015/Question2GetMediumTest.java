package meta.interview.coding241015;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Question2GetMediumTest{
    private static Question2GetMedium test;

    @BeforeAll
    static void beforeAll(){
        test = new Question2GetMedium();
    }

    @Test
    @DisplayName("test_getMedium_case1")
    void test_getMedium_case1() throws Exception{
        for(int iter : new int[]{3, 1, 2}){
            test.insert(iter);
        }
        assertEquals(test.getMedium(), 2);
    }

    @Test
    @DisplayName("test_getMedium_case2")
    void test_getMedium_case2() throws Exception{
        test = new Question2GetMedium();
        for(int iter : new int[]{7, 2, 4, 3}){
            test.insert(iter);
        }
        assertEquals(test.getMedium(), 3.5);
    }

    @Test
    @DisplayName("test_getMedium_case3")
    void test_getMedium_case3() throws Exception{
        test = new Question2GetMedium();
        assertThrows(Exception.class, ()->test.getMedium());
    }
}