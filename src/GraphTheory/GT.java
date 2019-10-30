package GraphTheory;

import java.util.LinkedList;
import java.util.Scanner;

public class GT {
    static int N = (int) (1e6+3);
    static boolean[] visited = new boolean[N+1];
    static LinkedList<Integer> graph[] = new LinkedList[N];
    public static void main(String[] args) throws Exception {
        for (int i=0; i<N; i++){
            graph[i] = new LinkedList<>();
        }
        Scanner in = new Scanner(System.in);
        int n, m, u, v;
        System.out.printf("Enter The Nodes");
        n = in.nextInt();
        System.out.println("Enter The Edges");
        m = in.nextInt();
        while (m-->0){
            u = in.nextInt();
            v = in.nextInt();
            graph[u].add(v);
            graph[v].add(u);
//            dfs(1);
//            if(visited[6]) System.out.println("Yes We Can Visit 6");
//            else {
//                System.out.println("We Cannot Visit 6");
//            }

        }
    }
//    private static void dfs(int u) {
//        for(int v : graph[u]){
//            System.out.println(v);
//            if(visited[v]) continue;
//            dfs(v);
//        }
//
//    }
}
