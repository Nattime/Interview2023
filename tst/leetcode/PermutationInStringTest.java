package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest{
    private static PermutationInString test;

    @BeforeAll
    public static void setUp(){
        test = new PermutationInString();
    }

    @Test
    void TestCase1(){
        assertTrue(test.checkInclusion("ab", "eidbaooo"));
    }

    @Test
    void TestCase2(){
        assertFalse(test.checkInclusion("ab", "eidboaoo"));
    }

    @Test
    void TestCase3(){
        assertFalse(test.checkInclusion("dinitrophenylhydrazine", "acetylphenylhydrazine"));
    }

    @Test
    void TestCase4(){
        assertTrue(test.checkInclusion("trinitrophenylmethylnitramine", "dinitrophenylhydrazinetrinitrophenylmethylnitramine"));
    }

    @Test
    void TestCase5(){
        assertTrue(test.checkInclusion("adc", "dcda"));
    }
}