package DailyCodingProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class FibEasy {
    class Val<T>{
        Map<Integer,List<T> > map = new HashMap<>();
        public void addVertex(T source){
            map.put((Integer) source, new LinkedList<>());
        }
        public void addEdge(T source, T destination, boolean bidrectional){
            if(!map.containsKey(source)){
                addVertex(source);
            }
            if(!map.containsKey(destination)){
                addVertex(destination);
            }
            map.get(source).add(destination);
            if(bidrectional){
                map.get(destination).add(source);
            }
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        List<Integer> e = new ArrayList<>();
        List<Integer> D = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        int t = 0;
        for(int i=0; i<t; i++){
            t = Integer.parseInt(bf.readLine());
            D.add(t);
            if(D.get(i) %2 == 0){
                e.add(D.get(i));

            }
            else{
                return;
            }
        }

    }
}
