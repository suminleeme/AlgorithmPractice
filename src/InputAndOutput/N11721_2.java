package InputAndOutput;
// 11721번 다른 풀이
// charAt() 사용

import java.util.Scanner;

public class N11721_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));

            if (i % 10 == 9) System.out.println();
        }
    }
}
