package resources;

public class ListNode extends Node{
    public int val;
    public ListNode next;

    public ListNode(){
    }

    @Override
    public String toString(){
        return val + "->" + next;
    }

    public int getData(){
        return val;
    }

    public ListNode(int val){
        this.val = val;
    }

    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

    public ListNode getNext(){
        return next;
    }
}
