package resources;

public class Node implements Comparable<Node>{
    public int data;
    public Node next, prev, left, right;

    public Node(){
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        result = prime * result + ((prev == null) ? 0 : prev.hashCode());
        result = prime * result + ((left == null) ? 0 : left.hashCode());
        result = prime * result + ((right == null) ? 0 : right.hashCode());
        return result;
    }

    @Override
    public int compareTo(Node o){
        return Integer.compare(this.getData(), o.getData());
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Node)){
            return false;
        }
        Node node = (Node)obj;
        boolean next = (this.getNext() == null && node.getNext() == null)
                || (this.getNext() != null && this.getNext().equals(node.getNext()));
        boolean prev = (this.getPrev() == null && node.getPrev() == null)
                || (this.getPrev() != null && this.getPrev().equals(node.getPrev()));
        boolean getRight = (this.getRight() == null && node.getRight() == null)
                || (this.getRight() != null && this.getRight().equals(node.getRight()));
        boolean getLeft = (this.getLeft() == null && node.getLeft() == null)
                || (this.getLeft() != null && this.getLeft().equals(node.getLeft()));
        return (node.getData() == this.getData()) && next && prev && getRight && getLeft;
    }

    public Node(int data){
        setData(data);
        next = prev = left = right = null;
    }

    public void setData(int data){
        this.data = data;
    }

    public void setNext(Node n){
        right = next = n;
    }

    public void setPrev(Node n){
        left = prev = n;
    }

    public void setLeft(Node n){
        setPrev(n);
    }

    public void setRight(Node n){
        setNext(n);
    }

    public int getData(){
        return data;
    }

    public Node getPrev(){
        if(left != null){
            return left;
        }
        return prev;
    }

    public Node getNext(){
        if(right != null){
            return right;
        }
        return next;
    }

    @Override
    public String toString(){
        return getData() + " ";
    }

    public Node getLeft(){
        return getPrev();
    }

    public Node getRight(){
        return getNext();
    }
}
