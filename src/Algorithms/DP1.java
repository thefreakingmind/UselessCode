package Algorithms;

/*
    In This Module, We Will Solve the Dynamic Programming Problem
    and Compare with Recursive Approach, to understand why recursions
    are bad.

 */

import edu.princeton.cs.algs4.StdIn;

// Recursive Solution
class Recurrsive{
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}


//Dynamic Programming Solution
// Memoization Technique

class DynamicProgramming{
    public  int fibdip(int n, int[] memo){
        if(n<=0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else if(memo[n] == 0) {
            memo[n] = fibdip(n-1, memo) + fibdip(n-2, memo);

        }
        return memo[n];
    }

}


public class DP1 {

    public static void main(String[] args){
        Recurrsive soln = new Recurrsive();
        int[] f = new int[100];
        System.out.println(soln.fib(12));
        System.out.println(new DynamicProgramming().fibdip(12, f));
        int d = StdIn.readInt();
        System.out.println(d);
    }





}
