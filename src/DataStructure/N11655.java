package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            char b = 0;

            if (a > 64 && a < 91) { // Upper
                b = (char)(a + 13);

                if (b > 90) {
                    b = (char)(b - 90 + 64);
                }
            } else if (a > 96 && a < 123) {
                b = (char)(a + 13);

                if (b > 122) {
                    b = (char)(b - 122 + 96);
                }
            } else {
                b = a;
            }
            sb.append(b);
        }
        System.out.println(sb);
        br.close();
    }
}
