package GraphTheory;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * @param:V-> Number of Vertices.
 * @param
 * @author sal
 */
class GraphImplementation{
    private int V;
    LinkedList<Integer> adj[];
    GraphImplementation(int v){
        this.V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    void BFS(int s){
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (queue.size()!=0){
            s = queue.poll();
            System.out.print(s+" ");
        }
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                visited[n] = true;
                queue.add(n);
            }
        }

    }

}

public class GraphDFSBFS {
    public static void main(String[] args) {
        GraphImplementation g = new GraphImplementation(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.BFS(1);


    }
}
