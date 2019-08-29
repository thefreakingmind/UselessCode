package DailyCodingProblems;
import java.io.*;


public class NextGreatest {

    public void nextGreatest(int[] arr ){
        int size = arr.length;
        int max_from_right = arr[size-1];
        arr[size-1] = -1;
        for(int i=size-2; i>=0; i--){
            int temp = arr[i];
            arr[i] = max_from_right;
            if(max_from_right< temp){
                max_from_right = temp;
            }
        }
    }

    public void printArray(int[] arr){
        int size = arr.length;
        for (int i = 0; i <size ; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void main(String[] args){
        int[] arr = {1,0, 4};
        NextGreatest ng = new NextGreatest();
        ng.nextGreatest(arr);
        ng.printArray(arr);

    }
}
