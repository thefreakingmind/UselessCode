package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Sherlock {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int dp[][] = new int[100][100];
        int N = (int)1e6+3;
        int[] arr = new int[N];
        int t = in.nextInt();
        while (t-->0){
            int n, i, j;
            n = in.nextInt();
            for(i=0; i<n; i++) {
                arr[i] = in.nextInt();
            }
            for(int m=0; m<n-1; m++){
                dp[i+1][0] = Math.max(dp[i][0], dp[i][1] + Math.abs(arr[i] - arr[i-1]));
                dp[i+1][1]=Math.max(dp[i][0]+Math.abs(arr[i+1]-1),dp[i][1]+Math.abs(arr[i]-arr[i+1]));
            }
            out.println(Math.max(dp[n-1][0], dp[n-1][1]));
        }
    }
}
