package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyTwoChocolatesTest {
    private static BuyTwoChocolates buyTwoChocolates;

    @BeforeAll
    static void setup() {
        buyTwoChocolates = new BuyTwoChocolates();
    }

    @Test
    void test1() {
        int val = buyTwoChocolates.buyChoco(new int[]{1, 2, 2}, 3);

        assertEquals(val, 0);
    }

    @Test
    void test2() {
        int val = buyTwoChocolates.buyChoco(new int[]{3, 2, 3}, 3);

        assertEquals(val, 3);
    }
}