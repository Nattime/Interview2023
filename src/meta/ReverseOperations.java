package meta;

import com.resources.Node;

/**
 * Reverse Operations
 * You are given a singly-linked list that contains N integers. A subpart of the list is a contiguous set of even elements, bordered either by either end of the list or an odd element. For example, if the list is [1, 2, 8, 9, 12, 16], the subparts of the list are [2, 8] and [12, 16].
 * Then, for each subpart, the order of the elements is reversed. In the example, this would result in the new list, [1, 8, 2, 9, 16, 12].
 * The goal of this question is: given a resulting list, determine the original order of the elements.
 * Implementation detail:
 * You must use the following definition for elements in the linked list:
 * <p>
 * class Node {
 * int data;
 * Node next;
 * }
 * <p>
 * Signature
 * Node reverse(Node head)
 * Constraints
 * 1 <= N <= 1000, where N is the size of the list
 * 1 <= Li <= 10^9, where Li is the ith element of the list
 */
public class ReverseOperations{
    Node reverse(Node head){
        // Write your code here
        Node first = new Node(0);
        first.next = head;
        Node trav = first;
        while(trav.next != null){
            if(trav.next.data % 2 == 0){
                Node end = trav.next;
                if(end.next == null){
                    break;
                }
                Node iter = end.next;
                while(iter != null && iter.data % 2 == 0){
                    Node temp = iter;
                    iter = iter.next;
                    temp.next = trav.next;
                    trav.next = temp;
                }
                end.next = iter;
                trav = end;
            }else{
                trav = trav.next;
            }
        }
        return first.next;
    }
}
