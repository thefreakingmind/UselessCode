package CodingContests.Codeagon;

import java.util.Scanner;
import java.io.PrintWriter;

public class LoveNine {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        long N = in.nextInt();
        int t = in.nextInt();
        int z = in.nextInt();
        while (z-->0){
            int m = t+z;
        }
        while(t--> 0){
            int j = in.nextInt();
            N = in.nextLong();
            String s = Long.toString(N);
            if(s.endsWith("9")){
                int d = Integer.parseInt(s);
                for(int i=0; i<100; i++){
                    for( j=0; j<100; j++){
                        for(int k=0; k<100; k++)
                        if(i+j+k == N){
                            out.println(i);
                            out.println(j);
                            out.println(k);
                        }
                    }
                }
            }
            else {
                out.print(-1);
            }

        }

    }
}
