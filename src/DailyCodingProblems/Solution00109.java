package DailyCodingProblems;

public class Solution00109 {
    public int numJewelsInStones(String J, String S) {
        int val = 0;
        char[] a = J.toCharArray();
        char[] b = S.toCharArray();
        for (int i = 0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    val++;
                }
            }
        }
        return val;

    }

    public static void main(String[] args) {
        Solution00109 ss = new Solution00109();
            System.out.println(ss.numJewelsInStones("Hello", "HWorld"));

    }
}
