package DailyCodingProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task002 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "I", "am", "Happy"};
        List<String> l1 = new ArrayList<String>();
        for (String x : arr) {
            l1.add(x);
        }
        List<String> l2 = new ArrayList<String>();
        String[] more_arr = {"Hello", "World"};
        for (String y : more_arr) {
            l2.add(y);
        }
        editlist(l1, l2);
        for (int i=0; i<l2.size(); i++){
            System.out.println(l1.get(i));
        }
        
    }

    private static void editlist(List<String> l1, List<String> l2) {
        Iterator it = l1.iterator();
        while (it.hasNext()){
            if(l2.contains(it.next())){
                it.remove();
            }
        }
    }
}
