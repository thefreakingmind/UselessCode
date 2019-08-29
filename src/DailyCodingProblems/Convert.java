package DailyCodingProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Convert {
    // Didnt Worked
    public String convert(String s, int numRows){
        if(numRows == 1) return s;
        List<StringBuilder> sb = new ArrayList<>();
        for (int i=0; i<Math.min(numRows, s.length()); i++){
            sb.add(new StringBuilder());
        }
        int currentRows = 0;
        boolean goingDown = false;
        for (char c: s.toCharArray()){
            sb.get(currentRows).append(c);
            if(currentRows == 0 || currentRows== numRows -1) goingDown =! goingDown;
            currentRows += goingDown ? 1 : -1;
        }
        StringBuilder ft = new StringBuilder();
        for(StringBuilder row: sb){
            ft.append(sb);

        }
        return ft.toString();
    }
}

class Solution00128{
    public String convert(String s, int numRows){
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        int N = s.length();
        int cycle = 0;
        for (int i =0; i<numRows; i++) {
            for (int j = 0; j < N; j += cycle) {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows && j + cycle - i < N)
                    sb.append(s.charAt(j + cycle - i));
            }
        }
        return sb.toString();
    }
}
