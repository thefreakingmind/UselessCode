package DailyCodingProblems;



public class Factorial {
    public int Fact(int a){
        if(a == 1){
            return 1;
        }
        else {
            return a*Fact(a-1);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(f.Fact(12));
    }
}
