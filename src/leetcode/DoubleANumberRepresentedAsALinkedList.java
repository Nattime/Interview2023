package leetcode;

import com.resources.ListNode;

/**
 * 2816. Double a Number Represented as a Linked List
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
public class DoubleANumberRepresentedAsALinkedList{
    public ListNode doubleIt(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            int sum = curr.val * 2;
            if(sum < 10){
                curr.val = sum;
            }else if(prev != null){
                curr.val = sum % 10;
                prev.val += 1;
            }else{
                head = new ListNode(1, curr);
                curr.val = sum % 10;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
