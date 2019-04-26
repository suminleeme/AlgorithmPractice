package SwExpertAcademy;

import java.util.*;
// 평균

public class SE2071 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < 10; j++) {
                sum += scanner.nextInt();
            }
            avg = sum / 10;
            if (sum % 10 > 4) avg += 1;
            System.out.printf("#%d %d\n", i + 1, avg);
        }
        scanner.close();
    }
}
