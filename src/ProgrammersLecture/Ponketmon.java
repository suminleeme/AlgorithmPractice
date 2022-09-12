package ProgrammersLecture;

import java.util.HashMap;
import java.util.Map;

class SolutionPonketmon {
    public int solution(int[] nums) {
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();
        int length = nums.length / 2;

        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int key = nums[i];
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        if (map.keySet().size() > length) {
            answer = length;
        } else {
            answer = map.keySet().size();
        }

        return answer;
    }
}

public class Ponketmon {
    public static void main(String[] args) {
        int[] array1 = {3,1,2,3};
        int[] array2 = {3,3,3,2,2,4};
        int[] array3 = {3,3,3,2,2,2};


        SolutionPonketmon solutionPonketmon = new SolutionPonketmon();

        System.out.println(solutionPonketmon.solution(array1));
        System.out.println(solutionPonketmon.solution(array2));
        System.out.println(solutionPonketmon.solution(array3));
    }
}
