package leetcode;

/**
 * 1475. Final Prices With a Special Discount in a Shop
 */
public class FinalPricesWithASpecialDiscountInAShop{
    public int[] finalPrices(int[] prices){
        int len = prices.length;
        int[] ret = new int[len];
        ret[len - 1] = prices[len - 1];
        for(int i = len - 2; i >= 0; i--){
            ret[i] = prices[i];
            for(int j = i + 1; j < len; j++){
                if(prices[j] <= prices[i]){
                    ret[i] -= prices[j];
                    break;
                }
            }
        }
        return ret;
    }
}
