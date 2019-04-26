package SwExpertAcademy;

import java.util.Scanner;

public class SE1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int max = arr[n - 1];
            long sum = 0;

            for (int j = n - 2; j >= 0; j--) {
                if (max > arr[j]) { sum += (max - arr[j]); }
                else {
                    max = arr[j];
                }
            }
            System.out.printf("#%d %d\n", i + 1, sum);
        }
        sc.close();
    }
}
