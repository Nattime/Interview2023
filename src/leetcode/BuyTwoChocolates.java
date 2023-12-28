package leetcode;

import java.util.Arrays;

public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for (int i = 1; i < prices.length; i++){
            if(prices[i] + prices[i - 1] <= money){
                return money - (prices[i] + prices[i - 1]);
            }else{
                return prices[i];
            }
        }

        return 0;
    }
}
