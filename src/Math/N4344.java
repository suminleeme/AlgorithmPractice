package Math;

import java.io.*;
import java.text.DecimalFormat;

public class N4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            String[] inputs = br.readLine().split(" ");
            int n = Integer.parseInt(inputs[0]);
            int[] scores = new int[n];
            double sum = 0;

            for (int i = 1; i < inputs.length; i++) {
                scores[i - 1] = Integer.parseInt(inputs[i]);
                sum += scores[i - 1];
            }
            double avg = sum / n;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (scores[i] > avg) {
                    count++;
                }
            }
            double percent = (double) count / n;
            DecimalFormat df = new DecimalFormat("0.000%");
            bw.write(df.format(percent));
            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}
