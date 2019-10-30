package DailyCodingProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        long total = 0;
        for(int i=0; i<arr.length; i++){
            i = in.nextInt();
        }
        long max = arr[0];
        long min = arr[0];
        for (int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
            total += arr[i];
        }
        long tn = total-max;
        long mt = total - min;


        System.out.printf("%d %d",tn, mt);


    }
}