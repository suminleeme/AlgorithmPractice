package InputAndOutput;

import java.util.Scanner;

public class N11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String inputs[] = scanner.next().split("");
        int sum = 0;

        for (int i = 0; i < inputs.length; i++) {
            sum += Integer.parseInt(inputs[i]);
        }
        System.out.println(sum);

        scanner.close();
    }
}
