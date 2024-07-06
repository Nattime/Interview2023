package leetcode;

import com.resources.ListNode;

/**
 * 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
 *
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints{
    public int[] nodesBetweenCriticalPoints(ListNode head){
        int[] ret = new int[2];
        ret[0] = Integer.MAX_VALUE;
        ret[1] = -1;
        int index = 1;
        int prevMax = -1;
        int maxI = -1;
        ListNode trav = head.next;
        while(trav != null){
            int num = trav.val;
            if(trav.next != null){
                if((head.val < num && trav.next.val < num) || (head.val > num && trav.next.val > num)){
                    if(maxI == -1){
                        maxI = index;
                    }
                    if(prevMax != -1){
                        ret[0] = Math.min(ret[0], index - prevMax);
                    }
                    prevMax = index;
                }
            }
            head = head.next;
            trav = trav.next;
            index++;
        }
        if(ret[0] == Integer.MAX_VALUE){
            ret[0] = -1;
        }else{
            ret[1] = prevMax - maxI;
        }
        return ret;
    }
}
