package leetcode;

import com.resources.ListNode;

/**
 * 206. Reverse Linked List
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
public class ReverseLinkedList{
    public ListNode reverseList(ListNode head){
        ListNode root = new ListNode(0);
        ListNode trav = null;
        while(head != null){
            trav = head;
            head = head.next;
            trav.next = root.next;
            root.next = trav;
        }
        return root.next;
    }
}
