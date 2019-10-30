package DailyCodingProblems;

import java.util.Scanner;
import java.io.PrintWriter;

public class XOR {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        out.print(a ^ b);
    }
}
