package LinkedList;

//API Implementation.

public class DoublyLinkedList {
    int[] next;
    int[] previous;
    public DoublyLinkedList(int MaxSize){
        next = new int[MaxSize+1];
        previous = new int[MaxSize+1];
    }
    public void Insert(int x, int pos){
        previous[x] = pos;
        next[x]  = next[pos];
        next[next[x]] = x;
        next[previous[x]] = x;
    }
    public void remove(int x){
        next[previous[x]] = next[x];
        previous[next[x]] = previous[x];
    }

    public static void main(String[] args) {
        DoublyLinkedList ds = new DoublyLinkedList(10);
        ds.Insert(10, 1);
        ds.Insert(2,2);
        for (int i=0; i<10; i++){
            System.out.print(ds.next);


        }

    }

}
