package CPAlgoTemplate;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;
import static java.util.Collections.*;

public class hay {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        else{
            return haystack.indexOf(needle);
        }


    }
    public char[] reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(new String(s));
        String v = sb.reverse().toString();
        System.out.println(v);
        return v.toCharArray();

    }

    public static void main(String[] args) {
        char s[] = new char[10];
        s = new char[]{'h', 'e', 'l', 'l', 'o'};
        hay h = new hay();

        System.out.println(h.reverseString(s));

    }
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
