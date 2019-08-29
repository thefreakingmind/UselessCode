package GraphTheory;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<T>{
    private Map<T, List<T>> map = new HashMap<>();
    public void addVertex(T s){
        map.put(s, new LinkedList<>());

    }
    public void addEdge(T source, T destination, boolean biDirectional){
        if(!map.containsKey(source)){
            addVertex(source);
        }
        if (!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(biDirectional){
            map.get(destination).add(source);
        }
    }
    public void getVertexCount(){
        System.out.println("The Graph has " + map.keySet().size() + "Vertex");
    }
    public void getEdges(boolean bidirectional){
        int count = 0;
        for (T v: map.keySet()){
            count+=map.get(v).size();
            System.out.println("The Graph has " + count + " Edges");
            if (bidirectional){
                count = count/2;
            }
        }
    }


    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1,2, false);
        g.addEdge(2,3, true);
        g.getVertexCount();
        g.getEdges(false);
    }

}