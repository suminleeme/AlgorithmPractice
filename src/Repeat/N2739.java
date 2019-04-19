package Repeat;

import java.util.Scanner;

public class N2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.print(n + " * " + i + " = " + n * i);
            System.out.println();
        }
        scanner.close();
    }
}
