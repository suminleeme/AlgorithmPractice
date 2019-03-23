package InputAndOutput;

import java.util.Scanner;

public class N10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            String inputs[] = scanner.next().split(",");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            System.out.println(a + b);
        }
        scanner.close();
    }
}
