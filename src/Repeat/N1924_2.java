package Repeat;

import java.util.Scanner;

public class N1924_2 {
    public static void main(String[] args) {
        char[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int cnt = 0;

        for (int i = 0; i < x - 1; i++) {
            cnt += day[i];
        }
        printDay((cnt + y) % 7);
    }

    static void printDay(int n) {
        switch (n) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 0:
                System.out.println("SUN");
                break;
            default:
                System.out.println("error");
        }
    }
}
