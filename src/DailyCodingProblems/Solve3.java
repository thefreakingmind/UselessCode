package DailyCodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solve3 {


    public static boolean booleanisPrime(int a){
        int b = (int)Math.sqrt(a);
        for (int i = 2; i <b ; i++) {
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int tp = userInput.nextInt();
        for(int t=0; t<=tp; t++ ){
            long result = userInput.nextLong();
            long c = 31623*31623-result;
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=0; i<31625; i++){
                if(c%i==0){
                    if(booleanisPrime((int)c/i)){
                        arr.add((int)(c/i));
                    }
                }
            }
            arr.remove(0);
            Collections.sort(arr);
            long d = arr.get(arr.size()-1);
            d = (long) Math.sqrt(d);
            d = d+2;
            System.out.println(1+" "+d);
            d = (d)*(d);
            long result2 = userInput.nextLong();
            d = d-result2;
            ArrayList<Integer> arr2 = new ArrayList<>();
            for(int i=0;i<arr.size();i++){
                if(d%arr.get(i)==0 ){

                    arr2.add(arr.get(i));
                }
            }
            System.out.println(2+" "+arr2.get(arr2.size()-1));
            String s1 = userInput.next();
        }
    }

}
