package Math;

import java.util.Scanner;

public class N2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int five = n / 5;
        n = n % 5;
        int three = 0;

        while (five >= 0) {
            if (n % 3 == 0) {
                three = n / 3;
                break;
            }
            five -= 1;
            n += 5;
        }
        System.out.println(five >= 0 ? five + three : -1);
        scanner.close();
    }
}
