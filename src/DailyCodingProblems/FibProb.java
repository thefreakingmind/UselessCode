package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibProb {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> D = new ArrayList<>();    
        for(int i=0; i<D.size(); i++){
            i = in.nextInt();
            D.add(i);
        }
        List<Integer> E = new ArrayList<>();
        for(int j: D){
            if(j%2 == 0){
                E.add(j);
            }
            else {
                continue;
            }

        }
    }
}
