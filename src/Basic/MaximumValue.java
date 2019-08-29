package Basic;

class Node{
    private int value = 0;

    public void InsertionSort(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while (j>0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public void PrintArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

public class MaximumValue {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Node val = new Node();
        int[] arr = {12,3,1,2,4};
        val.InsertionSort(arr);
        val.PrintArray(arr);

    }
}
