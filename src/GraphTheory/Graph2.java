package GraphTheory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Graph2<T> {
    private int V = 0;
    private LinkedList<Integer> adj[];
    public Graph2(int v){
        this.V = v;
        for (int i =0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    @Override
    public String toString() {
        return "Graph2{" +
                "V=" + V +
                ", adj=" + Arrays.toString(adj) +
                '}';
    }

    public static void main(String[] args) {
        Graph2 gg = new Graph2(10);
        gg.addEdge(1,2);
        gg.addEdge(2,3);
        gg.addEdge(3,4);
        System.out.println(gg.toString());

    }
}
