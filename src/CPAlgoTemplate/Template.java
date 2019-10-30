package CPAlgoTemplate;

import java.math.BigInteger;

public class Template {


    public long gcd(int a, int b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();
    }
    public static int gcdExtended(int a, int b, int x, int y)
    {
        if (a == 0) {
            x = 0;
            y = 1;
            return b;
        }
        int x1 = 1, y1 = 1;
        int gcd = gcdExtended(b % a, a, x1, y1);
        x = y1 - (b / a) * x1;
        y = x1;
        return gcd;
    }


    public static void main(String[] args) {
        int a = 200;
        int b = 400;
        System.out.println(new Template().gcd(a,b));
    }
}
