package Basic;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

class StackAPI{
    private Node head = null;

    private class Node{
        String item;
        Node next;

    }
    // Push Implementation from Head
    public void push(String item){
        Node oldfirst = head;
        head = new Node();
        head.item = item;
        head.next = oldfirst;
    }
    //Pop
    public String pop(){
        String item = head.item;
        head = head.next;
        return item;
    }
    public boolean isEmpty(){
        return head == null;
    }
}


public class Stack {
    //Client Implementation of Stack
    public static void main(String[] args)
    {
        StackAPI stack = new StackAPI();
        while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();
            if(s.equals('-'))
            {
                StdOut.print(stack.pop());

            }
            else{
                stack.push(s);
            }
        }
    }
}
