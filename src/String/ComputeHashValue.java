package String;

import java.util.ArrayList;

public class ComputeHashValue {
    /**
     * Convert The String to HashValue
     * @param s
     * @return hashvalue
     */
    public static long hashCompute(String s){
        ArrayList<Integer> val = new ArrayList<>();
        char[] arr = new char[100];
        arr = s.toCharArray();
        final int p = 31;
        final int m = (int) (1e9+9);
        long hashValue = 0;
        long p_pow = 1;
        for(char c: arr){
            hashValue = (hashValue + (c - 'a'+1)*p_pow)%m;
            p_pow = (p_pow*p)%m;
        }
        return hashValue;
    }

    public static void main(String[] args) {
        String s = "HelloWorld";
        System.out.println(hashCompute(s));
    }
}
