package DataStructure;

import java.io.*;

public class N10809_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        int len = input.length();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < len; j++) {
                char a = input.charAt(j);
                char b = (char)(i + 97);

                if (a == b) {
                    bw.write(j + " ");
                    j = len;
                    continue;
                }

                if (j == len - 1) {
                    bw.write(-1 + " ");
                }
            }
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
