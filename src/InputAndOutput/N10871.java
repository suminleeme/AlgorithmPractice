package InputAndOutput;

import java.io.*;

public class N10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        String[] numbers = br.readLine().trim().split(" ");

        for (int i = 0; i < n; i++) {
            int out = Integer.parseInt(numbers[i]);
            if (out < x) {
                bw.write(out + " ");
            }
        }
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
