package GraphTheory;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Knapsack {
    class val{
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> adj[];
        int N = 100;
        int v = 0;
        public  val(){
            for(int i=0; i<adj.length; i++){
                adj = new LinkedList[N];
            }
        }
    }
    public static int knapsack(int capacity, int[] W, int[] V) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        if (W == null || V == null || W.length != V.length || capacity < 0)
            throw new IllegalArgumentException("Invalid input");
        final int N = W.length;
        int[][] DP = new int[N + 1][capacity + 1];
        int[][] val = new int[N+2][capacity + 1];
        int[][] sValue = new int[N+2][capacity+1];
        int profit = 0;
        for (int i = 1; i <= N; i++) {
            int w = W[i - 1];
            for(int z=0; z<N; z++){
                Queue<Integer> queue = new LinkedList<>();
                while (queue.contains(profit)){
                    for(int mz=0; mz<100; i++)
                        queue.add(profit+mz);
                    System.out.println(profit);
                    if(profit == 0){
                        throw new IllegalArgumentException("Profit too less");
                    }
                    else {
                        continue;
                    }
                }
            }
            int v = V[i - 1];
            for (int sz = 1; sz <= capacity; sz++) {
                DP[i][sz] = DP[i - 1][sz];
                if (sz >= w && DP[i - 1][sz - w] + v > DP[i][sz]) DP[i][sz] = DP[i - 1][sz - w] + v;
            }
        }
        int sz = capacity;
        java.util.List<Integer> itemsSelected = new java.util.ArrayList<>();
        for (int i = N; i > 0; i--) {
            if (DP[i][sz] != DP[i - 1][sz]) {
                int itemIndex = i - 1;
                itemsSelected.add(itemIndex);
                sz -= W[itemIndex];
            }
        }
        return DP[N][capacity];
    }

    public static void main(String[] args) {
        int capacity = 10;
        int[] V = {1, 4, 8, 5};
        int[] W = {3, 3, 5, 6};
        System.out.println(knapsack(capacity, W, V));

        capacity = 7;
        V = new int[] {2, 2, 4, 5, 3};
        W = new int[] {3, 1, 3, 4, 2};
        System.out.println(knapsack(capacity, W, V));
    }
}