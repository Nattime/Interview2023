package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {
    private static TwoSum twoSum;

    @BeforeAll
    static void setup() {
        twoSum = new TwoSum();
    }

    @Test
    void testSum1() {
        int[] ret = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] result = {1, 0};
        sort(ret);
        sort(result);
        assertArrayEquals(ret, result);
    }

    @Test
    void testSum2() {
        int[] ret = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        int[] result = {1, 2};
        sort(ret);
        sort(result);
        assertArrayEquals(ret, result);
    }

    @Test
    void testSum3() {
        int[] ret = twoSum.twoSum(new int[]{3, 3}, 6);
        int[] result = {1, 0};
        sort(ret);
        sort(result);
        assertArrayEquals(ret, result);
    }

    void sort(final int[] arr) {
        Arrays.sort(arr);
    }
}