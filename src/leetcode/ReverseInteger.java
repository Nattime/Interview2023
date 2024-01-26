package leetcode;

/**
 * 7. Reverse Integer
 */
public class ReverseInteger{
    public int reverse(int x){
        int num = 0;

        if(x < 0){
            while(x < 0){
                if(num >= -214_748_364 && num <= -100_000_000){
                    if(x < -8){
                        return 0;
                    }
                }else if(num < -214_748_364){
                    return 0;
                }
                int dig = x % 10;
                num *= 10;
                num += dig;
                x /= 10;
            }
        }
        while(x > 0){
            if(num <= 214_748_364 && num >= 100_000_000){
                if(x > 7){
                    return 0;
                }
            }else if(num > 214_748_364){
                return 0;
            }
            int dig = x % 10;
            num *= 10;
            num += dig;
            x /= 10;
        }

        return num;
    }
}
