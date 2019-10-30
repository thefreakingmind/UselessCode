import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author salman
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Sherlock solver = new Sherlock();
        solver.solve(1, in, out);
        out.close();
    }

    static class Sherlock {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int dp[][] = new int[100][100];
            int z = 1000;
            int[] arr = new int[z];
            int t = in.nextInt();
            while (t-- > 0) {
                int n, i, j;
                n = in.nextInt();
                for (i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                for (int m = 0; m < n - 1; m++) {
                    dp[i + 1][0] = Math.max(dp[i][0], dp[i][1] + Math.abs(arr[i] - arr[i - 1]));
                    dp[i + 1][1] = Math.max(dp[i][0] + Math.abs(arr[i + 1] - 1), dp[i][1] + Math.abs(arr[i] - arr[i + 1]));
                }
                out.println(Math.max(dp[n - 1][0], dp[n - 1][1]));
            }
        }

    }
}

