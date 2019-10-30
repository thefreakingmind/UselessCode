package GraphTheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GProblem<T>{
    private Map<T, List<T>> map = new HashMap<>();
    public void addVertex(T s){
        map.put(s, new LinkedList<>());
    }
    public void addEdge(T source, T destination,boolean biDirectional){
        if(!map.containsKey(source)){
            addVertex(source);
        }
        if(!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(biDirectional){
            map.get(destination).add(source);
        }
    }
    public void getVertex(){
        System.out.println("The Graph has"+ map.keySet().size()+ "Vertex");
    }
    public void BFS(T source, int[] adj){

    }
}
