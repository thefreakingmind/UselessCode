package CodingContests.Codeagon;

import java.util.Scanner;
import java.io.PrintWriter;

public class ShadyString {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        String s = in.nextLine();
        int length;
        String pallindrome = new StringBuffer(s).reverse().toString();
        if(s.equals(pallindrome)){
            out.print(1);
        }else {

        }

    }
}
