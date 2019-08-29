package DailyCodingProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;

public class Socks {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        while (n-->0){
            int c = in.nextInt();
            Integer frequency = map.get(c);
            if (frequency == null){
                map.put(c, 1);
            }
            else {
                map.put(c, frequency+1);

            }
        }
        int pairs = 0;
        for(Integer frequency: map.values()){
            pairs+=frequency>>1;
        }
        out.println(pairs);
    }
}
