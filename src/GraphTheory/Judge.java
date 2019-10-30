package GraphTheory;

import java.util.*;

public class Judge {
    public int findTheJudge(int N, int[][] trust ){
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        int result = -1;

        for (int i=0; i<trust.length; i++){
            List<Integer> l = map.getOrDefault(trust[i][0], new ArrayList<>());
            l.add(trust[i][1]);
            map.put(trust[i][0], l);
        }
        for (int i =1; i<=N; i++){
            if(!map.containsKey(i)){
                result = i;
            }
        }
        for (int i=0; i<trust.length; i++){
            if(trust[i][1] == result){
                s.add(trust[i][0]);
            }
        }
        if(s.size() == N-1){
            return result;
        }

        return -1;

    }
}
