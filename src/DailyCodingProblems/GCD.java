package DailyCodingProblems;

import java.util.Scanner;
import java.io.PrintWriter;

public class GCD {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int result = gcd(a,b);
        out.print(result);

    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }else {
            return gcd(b, a%b);
        }
    }
}
