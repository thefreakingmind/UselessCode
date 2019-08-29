package Algorithms.Searching;

class IS{
    public int[] is(int[] arr){
        int N = arr.length;
        for (int i = 1; i <N+1 ; i++) {
            int key = arr[i];
            int j = arr[i-1];
            while (j>=0 && key<arr[j]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }

        return arr;

    }
}


public class Solve3 {
    public static void main(String[] args){
        int[] arr = {1,3,2,8,6,5,9};
        IS is =  new IS();
        System.out.println(is.is(arr));
    }

}
