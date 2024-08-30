package leetcode;

/**
 * 860. Lemonade Change
 */
public class LemonadeChange{
    public boolean lemonadeChange(int[] bills){
        int[] cash = {0, 0};
        for(int bill : bills){
            if(bill == 5){
                cash[0]++;
            }else{
                if(bill == 10){
                    if(cash[0] == 0){
                        return false;
                    }
                    cash[0]--;
                    cash[1]++;
                }else{
                    if((cash[0] < 3 && cash[1] == 0) || (cash[1] >= 1 && cash[0] < 1)){
                        return false;
                    }
                    if(cash[1] >= 1){
                        cash[1]--;
                        cash[0]--;
                    }else{
                        cash[0] -= 3;
                    }
                }
            }
        }
        return true;
    }
}
