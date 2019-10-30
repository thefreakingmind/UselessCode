package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class SherlockProblem {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int[] arr = new int[100];
        int[][] dp = new int[1000][2];
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < n - 1; i++) {
                dp[i + 1][0] = Math.max(dp[i][0], dp[i][1] + Math.abs(arr[i] - 1));
                dp[i + 1][1] = Math.max(dp[i][0] + Math.abs(arr[i + 1] - 1), dp[i][1] + Math.abs(arr[i] - arr[i + 1]));
                out.println(Math.max(dp[n - 1][0], dp[n - 1][1]));
            }
        }
    }
}
