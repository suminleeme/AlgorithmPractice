package SwExpertAcademy;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SE1204 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int testCase = Integer.parseInt(br.readLine());
            ArrayList<String> strArr = new ArrayList<>();
            String[] s = br.readLine().trim().split(" ");

            int[] indexArr = new int[s.length];
            Arrays.fill(indexArr, 1);
            strArr.add(s[0]);

            for (int j = 1; j < s.length; j++) {
                if (strArr.contains(s[j])) {
                    int index = strArr.indexOf(s[j]);
                    indexArr[index]++;
                } else {
                    strArr.add(s[j]);
                }
            }
            int maxIndex = 0;
            for (int j = 0; j < indexArr.length; j++) {
                if (indexArr[maxIndex] < indexArr[j]) maxIndex = j;
            }

            bw.write("#" + testCase + " " + strArr.get(maxIndex) + "\n");
        }
        bw.close();
    }
}
