package DailyCodingProblems;

/*
    Good morning! Here's your coding interview problem for today.
    This problem was recently asked by Google.
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
    Bonus: Can you do this in one pass?

 */


import java.util.ArrayList;
import java.util.List;



public class CodingProblem1 {
    public static boolean solve(int[] arr, int k ) {
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(arr[i] + arr[j] == k){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;


    }
    public static void main(String[] args){
        int[] arr = {10, 15, 8, 1};
        System.out.print(solve(arr, 5));
    }
}
