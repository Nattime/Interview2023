package leetcode;

import com.resources.ListNode;

import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
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
public class MergeKSortedLists{
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2)->Integer.compare(o1.val, o2.val));
        for(ListNode iter : lists){
            while(iter != null){
                queue.add(iter);
                iter = iter.next;
            }
        }

        ListNode head = queue.poll();
        ListNode trav = head;

        while(!queue.isEmpty()){
            trav.next = queue.poll();
            trav = trav.next;
            trav.next = null;
        }

        return head;
    }
}
