package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class NumberProduct {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int result1 = 0;
        int result2 = 0;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] += in.nextInt();
        }
        int left = arr[0];
        int right = arr[arr.length -1];
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                return;
            }
            result1 = left * arr[i] * right;
            result2 = left* arr[i] * right;
            out.print(result1 + " " + result2);
        }
    }
}
