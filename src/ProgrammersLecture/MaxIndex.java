package ProgrammersLecture;

/*최댓값 인덱스 구하기
        문제 설명
        주어진 입력중 최대값을 구하고, 최대값이 이 위치하는 index 값의 목록을 반환하세요.

        입력:
        [1, 3, 5, 4, 5, 2, 1]

        입력된 목록의 최대값은 5입니다.
        5와 동일한 값을 가진 위치는 3번째, 5번째 위치 입니다.
        이 위치에 해당하는 index는 [2, 4] 입니다.

        출력:
        [2, 4]

        입출력 예

        입력: [1, 3, 5, 4, 5, 2, 1]
        출력: [2, 4]
        👉🏻 위와 같습니다.

        입력: [3, 6, 10, 1, 7, 2, 4, 6, 10, 9]
        출력: [2, 8]
        👉🏻 최대값 10이 위치하는 곳은 3번째, 9번째 입니다. 이 위치의 index값은 2, 8입니다.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionMaxIndex {
    public int[] solution(int[] arr) {
        int maxValue = 0;
        List<Integer> maxIndexList = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            int newValue = arr[i];

            if (maxValue == newValue) {
                maxValue = newValue;
                maxIndexList.add(i);
            } else if (maxValue < arr[i]) {
                maxValue = newValue;
                maxIndexList.clear();
                maxIndexList.add(i);
            }
        }

        int size = maxIndexList.size();
        int[] answer = new int[size];

        for (int i=0; i<size; i++) {
            answer[i] = maxIndexList.get(i);
        }

        return answer;
    }
}

public class MaxIndex {
    public static void main(String args[]) {
        int[] array1 = {1, 3, 5, 4, 5, 2, 1};
        int[] array2 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};

        SolutionMaxIndex solutionMaxIndex = new SolutionMaxIndex();

        System.out.println(Arrays.toString(solutionMaxIndex.solution(array1)));
        System.out.println(Arrays.toString(solutionMaxIndex.solution(array2)));

//        System.out.println("answer : " + answer);
    }

}
