package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLengthOfStringAfterDeletingSimilarEndsTest{
    private static MinimumLengthOfStringAfterDeletingSimilarEnds test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new MinimumLengthOfStringAfterDeletingSimilarEnds();
    }

    @Test
    void TestCase1(){
        assertEquals(test.minimumLength("ca"), 2);
    }

    @Test
    void TestCase2(){
        assertEquals(test.minimumLength("cabaabac"), 0);
    }

    @Test
    void TestCase3(){
        assertEquals(test.minimumLength("aabccabba"), 3);
    }

    @Test
    void TestCase4(){
        assertEquals(test.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"), 1);
    }

    @Test
    void TestCase5(){
        assertEquals(test.minimumLength("aaaaaaaaaaaaa"), 0);
    }

    @Test
    void TestCase6(){
        assertEquals(test.minimumLength("aaaaaabbbbbababababababbabaabababbccccccbbbbbbaaa"), 29);
    }
}