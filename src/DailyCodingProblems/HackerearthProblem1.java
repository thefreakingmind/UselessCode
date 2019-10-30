package DailyCodingProblems;

import java.util.Scanner;

public class HackerearthProblem1 {
    public static void main(String[] args) throws Exception{
        int m, n, q, a, b;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                A[i][j] = 0;
            }
        }
        for (int i = 0; i <m ; i++) {
            a = in.nextInt();
            b = in.nextInt();
            A[a][b] = 1;
            A[b][a] = 1;
        }
        q = in.nextInt();
        for (int i = 0; i < q; i++) {
            a = in.nextInt();
            b = in.nextInt();
            if(A[a][b] == 1){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }

    }
}
