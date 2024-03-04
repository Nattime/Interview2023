package leetcode;

import resources.ListNode;

/**
 * 19. Remove Nth Node From End of List
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class RemoveNthNodeFromEndOfList{
    public ListNode removeNthFromEnd(ListNode head, int n){
        ListNode beg = new ListNode(0, head);
        ListNode trav = head.next;
        if(trav == null){
            return null;
        }
        for(int i = 1; i < n; i++){
            trav = trav.next;
        }
        ListNode prev = beg;
        while(trav != null){
            prev = prev.next;
            trav = trav.next;
        }
        prev.next = prev.next.next;
        return beg.next;
    }
}
