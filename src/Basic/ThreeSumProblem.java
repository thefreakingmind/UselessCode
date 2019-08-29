package Basic;

public class ThreeSumProblem {
    public static int count(int arr[]){
        int N = arr.length;
        int count = 0;

        for(int i=0; i<N; i++){
            for (int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    if(arr[i]+arr[j]+arr[k] ==0){
                        count++;
                    }
                }
            }
        }

        return count;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(count(arr));
    }
}

