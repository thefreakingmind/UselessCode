package Algorithms.DP;

import java.util.Iterator;


class DisjointSet{
    public static void createSet(int[] arr){
        int size = arr.length;
        int[] p = new int[size];
    }
}

public class StringHandler {
    public static void main(String[] args) {
        String s = "Hello World";
        for (int i=0; i<s.length(); i++){
            if (s.isEmpty()){
                System.out.println("The Value is Empty");
            }
            else{
                System.out.println("Please Append The Value in StringBuilder");
            }
        }
        StringBuilder sb = new StringBuilder("Hello").append("Work").reverse();
        System.out.println(sb.toString());

    }
}
