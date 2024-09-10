package leetcode;

import com.resources.ListNode;

/**
 * 2807. Insert Greatest Common Divisors in Linked List
 */
public class InsertGreatestCommonDivisorsInLinkedList{
    public ListNode insertGreatestCommonDivisors(ListNode head){
        ListNode trav = head;
        while(trav.next != null){
            int div = gcd(trav.val, trav.next.val);
            ListNode nextNode = new ListNode(div, trav.next);
            trav.next = nextNode;
            trav = nextNode.next;
        }
        return head;
    }

    private int gcd(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
