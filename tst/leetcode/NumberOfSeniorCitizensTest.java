package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfSeniorCitizensTest{
    private static NumberOfSeniorCitizens test;

    @BeforeAll
    static void beforeAll(){
        test = new NumberOfSeniorCitizens();
    }

    @Test
    @DisplayName("test_countSeniors_case1")
    void test_countSeniors_case1(){
        assertEquals(test.countSeniors(new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"}), 2);
    }

    @Test
    @DisplayName("test_countSeniors_case2")
    void test_countSeniors_case2(){
        assertEquals(test.countSeniors(new String[]{"1313579440F2036", "2921522980M5644"}), 0);
    }
}