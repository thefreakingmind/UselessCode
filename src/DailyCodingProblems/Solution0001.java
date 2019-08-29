package DailyCodingProblems;

public class Solution0001 {
    public String longestPalindrome(String s) {
        int N = s.length();
        if(s == null ||  N< 1){
            return " ";
        }
        int st = 0;
        int en = 0;
        for (int i=0; i<N; i++){
            int l1 = solve(s, i, i);
            int l2 = solve(s, i , i+1);
            int l3 = Math.max(l1, l2);
            if(l3> en - st){
                st = i-(l3-1)/2;
                en = i+l3/2;
            }

        }

        return s.substring(st, en+1);
    }
    public int solve(String s, int left, int right) {
        int N = s.length();
        int l = left;
        int r = right;
        while (l>=0 && r<N && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l -1;
    }
}
