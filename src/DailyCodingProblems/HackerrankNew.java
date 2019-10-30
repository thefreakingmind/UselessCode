package DailyCodingProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.List;
import java.util.Scanner;

public class HackerrankNew {
    static String timeConversion(String s) {
        char[] sss = s.toCharArray();
        int hh, mm, ss;
        hh = (sss[0] - '0') * 10 + (sss[1] - '0');
        mm = (sss[3] - '0') * 10 + (sss[4] - '0');
        ss = (sss[6] - '0') * 10 + (sss[4] - '0');
        if (hh < 12 && sss[8] == 'P') hh += 12;
        if (hh == 12 && sss[8] == 'A') hh = 0;
        System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);
        return null;
    }

    public static void triplets(List<Integer> a, List<Integer> b) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] atrip = new int[3];
        int[] btrip = new int[3];
        for (int i=0; i<atrip.length; i++){
            atrip[i] = Integer.parseInt(bf.readLine());
        }
        for (int i=0; i<btrip.length; i++){
            btrip[i] = Integer.parseInt(bf.readLine());
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
