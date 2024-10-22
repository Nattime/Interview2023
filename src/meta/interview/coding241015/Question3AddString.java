package meta.interview.coding241015;

/**
 * 10/16/24
 * Meta day 2 coding question 3
 * Take two positive numbers as strings and return the sum of them. •E.g. "34" + "9". => "43"
 */
public class Question3AddString{
    String add(String a, String b){
        StringBuilder str = new StringBuilder();
        int aInd = a.length() - 1;
        int bInd = b.length() - 1;
        int carryOver = 0;
        for(; aInd >= 0 || bInd >= 0; aInd--, bInd--){
            int sum = carryOver;
            if(aInd >= 0 && bInd >= 0){
                sum += (int)(a.charAt(aInd) - '0') + (b.charAt(bInd) - '0');
            }else if(aInd >= 0){
                sum += (int)(a.charAt(aInd) - '0');
            }else{
                sum += (int)(b.charAt(bInd) - '0');
            }
            carryOver = sum / 10;
            sum %= 10;
            str.append(sum);
        }
        if(carryOver > 0){
            str.append(carryOver);
        }
        return str.reverse().toString();
    }
}
