package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPlayersWithZeroOrOneLossesTest{
    private static FindPlayersWithZeroOrOneLosses test;

    @org.junit.jupiter.api.BeforeAll
    public static void setUp(){
        test = new FindPlayersWithZeroOrOneLosses();
    }

    @Test
    void TestCase1(){
        int[][] mat = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<Integer> noLoss = Arrays.asList(1, 2, 10);
        List<Integer> oneLoss = Arrays.asList(4, 5, 7, 8);
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(noLoss);
        actual.add(oneLoss);
        assertEquals(test.findWinners(mat), actual);
    }

    @Test
    void TestCase2(){
        int[][] mat = {{2, 3}, {1, 3}, {5, 4}, {6, 4}};
        List<Integer> noLoss = Arrays.asList(1, 2, 5, 6);
        List<Integer> oneLoss = new ArrayList<>();
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(noLoss);
        actual.add(oneLoss);
        assertEquals(test.findWinners(mat), actual);
    }

    @Test
    void TestCase3(){
        int[][] mat = {{1, 5}, {2, 5}, {2, 8}, {2, 9}, {3, 8}, {4, 7}, {4, 9}, {5, 7}, {6, 8}};
        List<Integer> noLoss = Arrays.asList(1, 2, 3, 4, 6);
        List<Integer> oneLoss = new ArrayList<>();
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(noLoss);
        actual.add(oneLoss);
        assertEquals(test.findWinners(mat), actual);
    }

    @Test
    void TestCase4(){
        int[][] mat = {{82888, 41455}, {12034, 96586}, {333, 78997}, {22985, 39301}, {80694, 50030}, {48515, 29395}, {94911, 91708}, {611, 18594}, {2775, 94514}, {54252, 69125}, {71649, 74118}, {34131, 57910}, {20902, 1668}, {43941, 95819}, {53872, 88879}, {133, 71327}, {17215, 60519}, {46647, 55420}, {53537, 76116}, {18805, 75915}, {40368, 89957}, {72470, 49613}, {72062, 78891}, {15491, 95714}, {49755, 30016}, {76421, 11083}, {78715, 85508}, {58659, 35981}, {67382, 4756}, {95767, 2501}, {13613, 4599}, {87280, 53540}, {57890, 91098}, {98318, 133}, {37340, 12843}, {46565, 44059}, {61510, 40777}, {47061, 90622}, {17475, 95970}, {29292, 92250}, {75550, 73549}, {21497, 35493}, {60340, 69998}, {15264, 82961}, {52626, 33949}, {13674, 91347}, {74617, 96699}, {95699, 37665}, {27651, 94864}, {91254, 80074}, {60859, 340}, {42786, 95152}, {88564, 95571}, {35017, 35031}, {99094, 54929}, {87749, 85289}, {64600, 62398}, {24039, 35821}, {28044, 48164}, {37799, 20281}, {56376, 44821}, {20967, 51924}, {82926, 10199}, {6760, 83058}, {61558, 31832}};
        List<Integer> noLoss = Arrays.asList(333, 611, 2775, 6760, 12034, 13613, 13674, 15264, 15491, 17215, 17475, 18805, 20902, 20967, 21497, 22985, 24039, 27651, 28044, 29292, 34131, 35017, 37340, 37799, 40368, 42786, 43941, 46565, 46647, 47061, 48515, 49755, 52626, 53537, 53872, 54252, 56376, 57890, 58659, 60340, 60859, 61510, 61558, 64600, 67382, 71649, 72062, 72470, 74617, 75550, 76421, 78715, 80694, 82888, 82926, 87280, 87749, 88564, 91254, 94911, 95699, 95767, 98318, 99094);
        List<Integer> oneLoss = Arrays.asList(133, 340, 1668, 2501, 4599, 4756, 10199, 11083, 12843, 18594, 20281, 29395, 30016, 31832, 33949, 35031, 35493, 35821, 35981, 37665, 39301, 40777, 41455, 44059, 44821, 48164, 49613, 50030, 51924, 53540, 54929, 55420, 57910, 60519, 62398, 69125, 69998, 71327, 73549, 74118, 75915, 76116, 78891, 78997, 80074, 82961, 83058, 85289, 85508, 88879, 89957, 90622, 91098, 91347, 91708, 92250, 94514, 94864, 95152, 95571, 95714, 95819, 95970, 96586, 96699);
        List<List<Integer>> actual = new ArrayList<>();
        actual.add(noLoss);
        actual.add(oneLoss);
        assertEquals(test.findWinners(mat), actual);
    }
}