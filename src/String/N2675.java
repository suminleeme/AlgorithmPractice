package String;

import java.io.*;

public class N2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int r = 0;

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().trim().split(" ");
            r = Integer.parseInt(input[0]);
            String[] str = input[1].split("");

            for (int j = 0; j < str.length; j++) {
                for (int k = 0; k < r; k++) {
                    bw.write(str[j]);
                }
            }
            bw.write("\n");
        }
        bw.close();
    }
}
