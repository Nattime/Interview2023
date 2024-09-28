package leetcode;

/**
 * 641. Design Circular Deque
 */

/*
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
public class DesignCircularDeque{
    static class MyCircularDeque{
        private final int[] arr;
        private int frontIndex;
        private int endIndex;
        private int count;
        private final int size;

        public MyCircularDeque(int k){
            size = k;
            arr = new int[k];
            frontIndex = 0;
            endIndex = k - 1;
            count = 0;
        }

        public boolean insertFront(int value){
            if(isFull()){
                return false;
            }
            frontIndex = (--frontIndex + size) % size;
            arr[frontIndex] = value;
            count++;
            return true;
        }

        public boolean insertLast(int value){
            if(isFull()){
                return false;
            }
            endIndex = ++endIndex % size;
            arr[endIndex] = value;
            count++;
            return true;
        }

        public boolean deleteFront(){
            if(isEmpty()){
                return false;
            }
            frontIndex = (++frontIndex) % size;
            count--;
            return true;
        }

        public boolean deleteLast(){
            if(isEmpty()){
                return false;
            }
            endIndex = (--endIndex + size) % size;
            count--;
            return true;
        }

        public int getFront(){
            return isEmpty() ? -1 : arr[frontIndex];
        }

        public int getRear(){
            return isEmpty() ? -1 : arr[endIndex];
        }

        public boolean isEmpty(){
            return count == 0;
        }

        public boolean isFull(){
            return count == size;
        }
    }
}
