package DailyCodingProblems;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HR001 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] atrip = new int[3];
        int[] btrip = new int[3];
        for (int i=0; i<atrip.length; i++){
            atrip[i] = in.nextInt();
        }
        for (int i=0; i<btrip.length; i++){
            btrip[i] = in.nextInt();
        }
        int ap = 0;
        int bp = 0;
        for (int i = 0; i <3 ; i++) {
            if(atrip[i]> btrip[i]){
                ap += 1;
            }
            else if (btrip[i]> atrip[i]){
                bp+=1;
            }
        }
        System.out.printf("%d %d", ap, bp);
    }
}

