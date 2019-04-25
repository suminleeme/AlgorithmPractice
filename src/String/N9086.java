package String;

import java.io.*;

public class N9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] s = br.readLine().trim().split("");

            bw.write(s[0] + s[s.length - 1] + "\n");
            bw.flush();
        }
        bw.close();
    }
}
