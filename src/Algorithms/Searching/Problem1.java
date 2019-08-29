package Algorithms.Searching;



/*
Given a binary matrix A, we want to flip the image horizontally,
then invert it, and return the resulting image.To flip an image horizontally means that each row of
the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0, 1, 1] results in [1, 0, 0].
 */


public class Problem1 {
    public static int[][] flip(int[][] A) {
        int c = A[0].length;
        for (int[] row : A) {
            for (int i = 0; i < (c + 1) / 2; i++) {
                int val = row[i] ^ 1;
                row[i] = row[c - 1 - i] ^ 1;
                row[c - 1 - i] = val;

            }
        }
        return A;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1}, {0,0,0}};
        int[][] val = flip(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
