package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class BirthdayCake {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxheight = 1;
        int countMax = 0;

        for(int i=0; i<n; i++){
            int temp = in.nextInt();

            if(temp>maxheight){
                maxheight = temp;
                countMax = 1;
            }
            else if(temp==maxheight){
                countMax++;
            }
        }
        out.print(countMax);
    }
}
