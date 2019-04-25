package Repeat;

import java.util.Scanner;

public class N1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 1) {
            int n = y % 7;
            printDay(n);
        } else if (x == 2) {
            int n = (y + 31) % 7;
            printDay(n);
        } else if (x == 3) {
            int n = (y + 31 + 28) % 7;
            printDay(n);
        } else if (x == 4) {
            int n = (y + 31 * 2 + 28) % 7;
            printDay(n);
        } else if (x == 5) {
            int n = (y + 31 * 2 + 30 + 28) % 7;
            printDay(n);
        } else if (x == 6) {
            int n = (y + 31 * 3 + 30 + 28) % 7;
            printDay(n);
        } else if (x == 7) {
            int n = (y + 31 * 3 + 30 * 2 + 28) % 7;
            printDay(n);
        } else if (x == 8) {
            int n = (y + 31 * 4 + 30 * 2 + 28) % 7;
            printDay(n);
        } else if (x == 9) {
            int n = (y + 31 * 5 + 30 * 2 + 28) % 7;
            printDay(n);
        } else if (x == 10) {
            int n = (y + 31 * 5 + 30 * 3 + 28) % 7;
            printDay(n);
        } else if (x == 11) {
            int n = (y + 31 * 6 + 30 * 3 + 28) % 7;
            printDay(n);
        } else if (x == 12) {
            int n = (y + 31 * 6 + 30 * 4 + 28) % 7;
            printDay(n);
        }
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
