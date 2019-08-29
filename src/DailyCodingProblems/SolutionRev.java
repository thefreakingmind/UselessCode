package DailyCodingProblems;

import java.math.BigInteger;

public class SolutionRev{
    public int myAtoi(String str) {

        int start = -1;
        long sum = 0;

        String str1 = new String(str.trim());

        if(str1.isEmpty())
            return 0;

        char[] ch = str1.toCharArray();

        if(!Character.isDigit(ch[0]) && ch[0] != '-' && ch[0] != '+')
            return 0;

        for(int i=0; i<ch.length;i++) {

            if(i != 0 && !Character.isDigit(ch[i])) {
                sum = (start != -1) ? -sum : sum;
                return (int)sum;
            }

            if(Character.isDigit(ch[i])) {

                if(i != 0 && ch[i-1] == '-')
                    start = i;

                if((start == -1) && ((sum * 10 + (ch[i] - '0')) >= Integer.MAX_VALUE))
                    return Integer.MAX_VALUE;
                if((start != -1) && (-(sum * 10 + (ch[i] - '0')) <= Integer.MIN_VALUE))
                    return Integer.MIN_VALUE;

                sum = sum * 10 + (ch[i] - '0');
            }
        }

        if(start != -1) {
            sum = -sum;
        }

        return (int)sum;
    }
}