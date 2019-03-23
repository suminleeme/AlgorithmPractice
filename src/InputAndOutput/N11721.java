package InputAndOutput;

import java.util.Scanner;

public class N11721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs[] = scanner.next().split("");

        for (int i = 0; i < inputs.length; i+=10) {
            for (int j = i; j < i + 10; j++) {
                if (j == inputs.length) break;

                System.out.print(inputs[j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}