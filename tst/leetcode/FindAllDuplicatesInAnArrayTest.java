package leetcode;

import com.resources.Create;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllDuplicatesInAnArrayTest{
    private static FindAllDuplicatesInAnArray test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new FindAllDuplicatesInAnArray();
    }

    @Test
    void TestCase1(){
        List<Integer> output = Create.createList(new int[]{2, 3});
        assertEquals(test.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}), output);
    }

    @Test
    void TestCase2(){
        List<Integer> output = Create.createList(new int[]{1});
        assertEquals(test.findDuplicates(new int[]{1, 1, 2}), output);
    }

    @Test
    void TestCase3(){
        List<Integer> output = Create.createList(new int[]{});
        assertEquals(test.findDuplicates(new int[]{1}), output);
    }
}