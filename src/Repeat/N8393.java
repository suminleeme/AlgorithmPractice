package Repeat;

import java.util.Scanner;

public class N8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        while (n > 0) {
            sum += n;
            n = n - 1;
        }
        System.out.println(sum);
    }
}
