package Math;

import java.io.*;
import java.util.Arrays;

public class N10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s[] = br.readLine().trim().split(" ");
        int[] list = new int[3];

        for (int i = 0; i < 3; i++) {
            list[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(list);
        bw.write(list[1] + "\n");
        bw.flush();
        bw.close();
    }
}
