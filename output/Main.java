import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
        Socks solver = new Socks();
        solver.solve(1, in, out);
        out.close();
    }

    static class Socks {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            while (n-- > 0) {
                int c = in.nextInt();
                Integer frequency = map.get(c);
                if (frequency == null) {
                    map.put(c, 1);
                } else {
                    map.put(c, frequency + 1);

                }
            }
            int pairs = 0;
            for (Integer frequency : map.values()) {
                pairs += frequency >> 1;
            }
            out.println(pairs);
        }

    }
}

