package DailyCodingProblems;

/*
    [3,4,-1,1]
 */

public class Solution4 {
    public int solve(int[] arr){
        int N = arr.length;
        int M = arr.length -1;
        int val = 0;
        for (int i: arr){
            if(arr[i] != i){
                val = i;
            }
        }
        return val;

    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
        int[] arr = {3,4,-1,1};
        Solution4 valsolve = new Solution4();
        System.out.println(valsolve.solve(arr));
    }
}
