package leetcode;

import com.resources.ListNode;

/**
 * 725. Split Linked List in Parts
 */
public class SplitLinkedListInParts{
    public ListNode[] splitListToParts(ListNode head, int k){
        ListNode[] ret = new ListNode[k];
        ListNode trav = head;
        int count = 0;
        while(trav != null){
            trav = trav.next;
            count++;
        }
        trav = head;
        if(count < k){
            for(int i = 0; i < count; i++){
                ret[i] = trav;
                ListNode temp = trav;
                trav = trav.next;
                temp.next = null;
            }
        }else{
            int rem = count % k;
            for(int i = 0; i < k; i++){
                ListNode curr = trav;
                int len = (count / k);
                ret[i] = curr;
                if(rem-- > 0){
                    len++;
                }
                for(int j = 1; j < len; j++){
                    trav = trav.next;
                }
                ListNode temp = trav;
                trav = trav.next;
                temp.next = null;
            }
        }
        return ret;
    }
}
