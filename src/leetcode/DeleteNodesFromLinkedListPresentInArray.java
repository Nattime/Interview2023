package leetcode;

import com.resources.ListNode;

/**
 * 3217. Delete Nodes From Linked List Present in Array
 */
public class DeleteNodesFromLinkedListPresentInArray{
    public ListNode modifiedList(int[] nums, ListNode head){
        int maxNum = -1;
        for(int num : nums){
            maxNum = Math.max(maxNum, num);
        }
        boolean[] arr = new boolean[maxNum + 1];
        for(int num : nums){
            arr[num] = true;
        }
        ListNode front = new ListNode(0, head);
        ListNode trav = front;
        while(trav != null){
            boolean isIn = false;
            if(trav.next != null){
                int num = trav.next.data;
                if(num <= maxNum && arr[num]){
                    trav.next = trav.next.next;
                    isIn = true;
                }
            }
            if(!isIn){
                trav = trav.next;
            }
        }
        return front.next;
    }
}
