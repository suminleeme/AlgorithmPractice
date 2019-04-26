package Math;

import java.util.Scanner;

public class N1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0;
        float m = 0;
        float[] arr = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (m < arr[i]) m = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]/ m * 100;
            sum += arr[i];
        }
        System.out.println(sum / n);
    }
}
