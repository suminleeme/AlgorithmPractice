package DataStructure;

import java.util.*;

public class N10820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            StringBuilder sb = new StringBuilder();
            String input = scanner.nextLine();
            int[] check = new int[4];

            // 소문자, 대문자, 숫자, 공백
            for (int i = 0; i < input.length(); i++) {
                int ascii = input.charAt(i);

                if (ascii >= 97 && ascii <= 122) {
                    check[0]++;
                } else if (ascii >= 65 && ascii <= 90){
                    check[1]++;
                } else if (ascii >= 48 && ascii <= 57) {
                    check[2]++;
                } else if (ascii == 32) {
                    check[3]++;
                } else {
                    continue;
                }
            }

            for (int i = 0; i < 4; i++) {
                sb.append(check[i]);

                if (i == 3) break;
                sb.append(' ');
            }
            System.out.println(sb);
        }
        scanner.close();
    }
}
