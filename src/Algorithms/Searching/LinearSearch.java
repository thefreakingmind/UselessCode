package Algorithms.Searching;

public class LinearSearch {
    public static int search(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] val = {100, 200, 300, 400, 500};
        int n = 400;
        int result = search(val, n);
        if(result == -1){
            System.out.println("No Element Matched");
        }else{
            System.out.println("Element found at" + result);
        }
    }
}
