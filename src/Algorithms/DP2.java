package Algorithms;


public class DP2 {
    public static int Fib(int n){
        int[] memo = new int[n];
        if(n<=2){
            return 1;
        }
        else{
            memo[n] = Fib(n-1) + Fib(n-2);
        }
        return memo[n];
    }

    public static void main(String[] args){
        for(int i=0; i<20; i++){
            System.out.println(Fib(i));
        }
    }
}
