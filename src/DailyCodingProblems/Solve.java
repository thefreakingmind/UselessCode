package DailyCodingProblems;

class SortingSystem{
    public void sortInsertion(int arr[]){
        int N = arr.length;
        for(int i=1; i<N; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = j;

        }

    }
    public void Print(int[] a){
        int N = a.length;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

public class Solve {
    public static void main(String[] args){
        SortingSystem ss = new SortingSystem();
        int[] arr = {1,3,1,2,5,6,9,8,10};
        ss.sortInsertion(arr);
        ss.Print(arr);
    }
}
