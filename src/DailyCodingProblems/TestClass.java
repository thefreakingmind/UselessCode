package DailyCodingProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] S = new String[N];
        for(int i=0; i<N; i++) {
            S[i] = br.readLine();
        }
        String[] out_= solve(N, S);
        for(int i=0;i<N;i++) {
            System.out.println(out_[i]);
        }
        wr.close();
        br.close();
    }
    static String[] solve(int N, String[] S){
        Scanner sc = new Scanner(System.in);
        N = S.length;
        List<String> ll = Arrays.asList(S);
        if(ll.contains(sc.nextLine())){
            System.out.println("No");
        }
        else {
            ll.add(sc.nextLine());
            System.out.println("Yes");
        }
        return S;
    }
}