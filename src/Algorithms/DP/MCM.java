package Algorithms.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.OptionalInt;

public class MCM {
    public static void main(String[] args) {
        MCM mcm = new MCM();
        int[] arr = {4,2,3,5,3};
        int cost = mcm.findCost(arr);
        System.out.println(cost);

    }

    private int findCost(int arr[]) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = 10;
        int z = 20;
        int temp[][] = new int[arr.length+1][arr.length+1];
        int m = (int) Math.pow(x, 2);
        int dp[][] = new int[arr.length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length -i; j++){
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i+1; k<z; k++){
                    int q = dp[i][k] + dp[k][z] + arr[i]* arr[k]* arr[j];
                    if(q>dp[i][j]){
                        dp[i][j] = q;
                    }
                }
            }
        }
        return dp[0][arr.length-1];
    }
}
