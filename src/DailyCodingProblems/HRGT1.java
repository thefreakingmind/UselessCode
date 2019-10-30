package DailyCodingProblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HRGT1 {
    public class Graph<T>{
        Map<T, List<T>> map = new HashMap<>();
        public void addVertex(T s){
            map.put(s, new LinkedList<>());
        }
        public void addEdge(T source, T destination, boolean bidirectional){
            if(!map.containsKey(source)){
                addVertex(source);
            }
            else if(!map.containsKey(destination)){
                addVertex(destination);
            }
            map.get(source).add(destination);
            if(bidirectional){
                map.get(destination).add(source);
            }
        }
        public void BFS(T source, int[] adj){
            // Implement a BFS

        }
    }
}
