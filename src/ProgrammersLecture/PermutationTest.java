package ProgrammersLecture;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// 통과는 하는데 효율성 통과못함
public class PermutationTest {

        public static boolean solution(int[] arr) {

            //O(nlogn)
            int[] answer = new int[arr.length];
            for (int i=0; i<arr.length; i++) answer[i] = i+1; //O(n)

            Arrays.sort(arr); // sort는 O(nlogn)

            return Arrays.equals(answer, arr); //O(n)

            //O(N^2)
            /*List<Integer> arrList = new ArrayList<>();

            for (int a : arr) {
                arrList.add(a);
            }

            for (int i=0; i<arrList.size(); i++) {
                if (!arrList.contains(i+1)) {
                    return false;
                }
            }
            return true;*/
        }

    public static void main(String[] args) {
        int arr[] = {4,1,3};
        System.out.println(solution(arr));

    }
}
