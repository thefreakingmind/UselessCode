package Algorithms.Sorting;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
    Task: Implement a Sorting System using MergeSort Method.
 */

class MergeSort{
    List<String> list = new ArrayList<String>();

    public void Merge(int[] arr, int mid, int l , int r){
        //TODO Implement a Merge Method.

    }
    public void sort(int[] arr, int l, int r){
        //TODO Implement a Sort Method.

    }
    public void PrintArray(int[] arr){
        int N = arr.length;
        for(int i=0; i<N; i++){
            System.out.println(arr[i]);
            System.out.print(" ");
        }
    }

    //Client Code for Calling Merge Sort API
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {2,3,1,2,1,4,5,1};
        map.put("Father", 1);
        System.out.print(map);
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 2, 3);
        mergeSort.PrintArray(arr);



    }
}