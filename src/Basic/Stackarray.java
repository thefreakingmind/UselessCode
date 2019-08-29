package Basic;

class StackArrayAPI{

    private String[] s;
    private int N = 0;
    public StackArrayAPI(int capacity){
        s = new String[capacity];
    }
    public void push(String data){
        s[N++] = data;

    }
    public String pop(){
        String item =  s[--N];
        s[N] = null;
        return item;

    }
    public void Print(){
        for(int i=0; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}


public class Stackarray {
    public static void main(String[] args)
    {
        StackArrayAPI stack = new StackArrayAPI(6);
        stack.push("Hello");
        stack.Print();

    }

}
