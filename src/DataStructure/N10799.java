package DataStructure;

import java.util.Scanner;

public class N10799 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        int s = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                s++;
            } else { // ')'
                if (i > 1 && input.charAt(i - 1) == '(') {
                    s--;
                    count += s;
                } else if (i == 1) {
                    s--;
                } else {
                    s--;
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}
