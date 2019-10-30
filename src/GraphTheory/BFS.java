package GraphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BFS<T> {
    public void BFSAlgo(int S, int[] adj){
        Map<Integer,Integer> level = new HashMap<>();
        Map<Integer, Integer> parent = new HashMap<>();
        int i =1;
        List<Integer> Frontier = new ArrayList<>();
        int k =0;
        while (k <Frontier.size()){
            List<Integer> next = new ArrayList<>();
            for(Integer u: Frontier){
                for(int v=0; v<adj[u]; v++){
                    if(!level.containsKey(v)){
                        level.put(S, v);
                        parent.put(S, v);
                        next.add(v);
                    }
                }
            }Frontier = next;
            i = i+1;
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        BFS bfs = new BFS();
        int[] arr = {1,2,3,4,5,6};
        bfs.BFSAlgo(1,arr);
    }

}
