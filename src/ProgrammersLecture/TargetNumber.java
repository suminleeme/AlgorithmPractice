package ProgrammersLecture;

class SolutionTargetNumber {
    public int solution(int[] numbers, int target) {
        return sumRecurCount(numbers, target, 0, 0);
    }

    int sumRecurCount(final int[] numbers, final int target, int i, int sum) {
        if (i == numbers.length) {
            if (sum == target) return 1;
            return 0;
        }

        return sumRecurCount(numbers, target, i+1, sum+numbers[i])
                + sumRecurCount(numbers, target, i+1, sum-numbers[i]);
    }
}

public class TargetNumber {
    public static void main(String[] args) {
        SolutionTargetNumber solutionTargetNumber = new SolutionTargetNumber();
        int[] arr1 = {1,1,1,1,1};
        int[] arr2 = {4,1,2,1};

        System.out.println(solutionTargetNumber.solution(arr1,3));
        System.out.println(solutionTargetNumber.solution(arr2,2));

    }
}
