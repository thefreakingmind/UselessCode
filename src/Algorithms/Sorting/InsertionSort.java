package Algorithms.Sorting;


// Insertion Sort where I is the Key Counter
// J is the Counter for The Element Moving i-1

public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j +1] = key;
        }
    }

    public  void printArray(int[] arr){
        int N = arr.length;
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args){
        int[] arr = {1,3,42,4,1,5,23};
        InsertionSort is = new InsertionSort();
        is.sort(arr);
        is.printArray(arr);

    }
}