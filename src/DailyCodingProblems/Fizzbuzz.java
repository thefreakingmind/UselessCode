package DailyCodingProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i =1; i<100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0){
                System.out.println("Fizz");
            }
            else if (i%5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);

            }
        }
    }

}
