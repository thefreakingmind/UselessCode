package DailyCodingProblems;

class Solution{
    public int solve(int a[]){
        int n = a.length;
        int ones = 0;
        int twos = 0;
        int bitmask_ = 0;
        for (int i=0; i<n; i++){
            twos = twos | (ones & a[i]);
            ones = ones^a[i];
            bitmask_ = ~(ones & twos);
            ones &= bitmask_;
            twos &= bitmask_;
        }

        return ones;
    }
}

public class DCP1 {
    public static void main(String[] args){
        int[] arr = {4, 3, 2, 4, 1, 3, 2};
        Solution newSolution = new Solution();
        System.out.println(newSolution.solve(arr));

    }
}
