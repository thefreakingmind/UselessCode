package DailyCodingProblems;

import java.util.Scanner;
import java.io.PrintWriter;

public class CoinProblem {
    int n;
    int[] arr = new int[100];
    int[][] dp = new int[52][252];
    boolean[][] result = new boolean[1000][1000];

    public int calculate(int i, int val) {
        if (val < 0) return 0;
        if (val == 1) return 1;
        if (i > n) return 0;
        if(result[i][val] == false){
            dp[i][val] = calculate(i, val-arr[i])+ calculate(i+1, val);
            result[i][val] = true;
        }
        return dp[i][val];
    }

    public void solve(int testNumber, Scanner in, PrintWriter out) throws Exception {
        int make = in.nextInt();
        n = in.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        out.println(calculate(1, make));
    }
}
