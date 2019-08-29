package DailyCodingProblems;


import java.util.ArrayList;
import java.util.List;

public class Subset {
    List<List<Integer>> result = new ArrayList<>();
    public void todo(int length, int now, int index, int[] nums, List<Integer> temp){
        if(index== length|| now==length){
            result.add(temp);
        }
        temp.add(nums[now]);
        todo(length, now+1, index+1, nums, temp);
        temp.remove(temp.size()-1);
        todo(length, now+1, index+1, nums, temp);

    }


    public List<List<Integer>> subset(int[] nums){
        int N = nums.length;
        List<Integer> temp = new ArrayList<>();
        todo(N, 0, 0, nums, temp);
        return result;
    }
}
