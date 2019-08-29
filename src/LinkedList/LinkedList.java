package LinkedList;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class LinkedList {
    public static Node head;
    public static void insertBack(int data){
           Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public static void insertFront(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public static void printValue(){
        Node tempValue = head;
        while (tempValue.next != null){
            System.out.println(tempValue.data);
            tempValue = tempValue.next;
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insertFront(12);
        ll.insertBack(23);
        ll.insertBack(40);
        ll.printValue();

    }
}
