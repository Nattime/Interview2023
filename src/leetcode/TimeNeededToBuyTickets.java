package leetcode;

/**
 * 2073. Time Needed to Buy Tickets
 */
public class TimeNeededToBuyTickets{
    public int timeRequiredToBuy(int[] tickets, int k){
        int count = 0;
        int num = tickets[k];
        for(int i = 0; i < tickets.length; i++){
            int t = tickets[i];
            if(i <= k){
                if(t >= num){
                    count += num;
                }else{
                    count += tickets[i];
                }
            }else{
                if(t >= num){
                    count += (num - 1);
                }else{
                    count += (tickets[i]);
                }
            }
        }
        return count;
    }
}
