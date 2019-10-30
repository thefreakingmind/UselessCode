package GraphTheory;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphClassGen {
    private static boolean[] visited = new boolean[100];
    static int n = (int) (1e6+3);
    static List<Integer> Graph[] = new List[n];

    public static void dfs(int s){
        if(visited[s]){
            return;
        }
        visited[s] = true;
        for(int i: Graph[s]){
            dfs(i);
        }
    }
    public void bfs(int s){
        /**
         * Implement BFS
         */
    }
    public static void main(String[] args) {
        Graph[1].add(2);
        Graph[2].add(3);
        Graph[3].add(4);
//        dfs(1);
//        if(visited[6]){
//            System.out.println("We Can Visit it");
//        }
//        else{
//            System.out.println("We Cannot Visit it");
//        }


    }
}
