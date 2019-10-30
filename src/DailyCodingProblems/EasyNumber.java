package DailyCodingProblems;

import net.egork.chelper.util.InputReader;
import java.io.PrintWriter;

public class EasyNumber {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.readInt();
        while (t-->0){
            long a = in.readLong();
            int b = in.readInt();
            long result = a >> b;
            out.println(result);
        }
    }
}
