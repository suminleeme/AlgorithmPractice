package Math;

import java.io.*;

public class N2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[][] arr1 = new int[n][m];

        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");

            for (int j = 0; j < m; j++) {
                arr1[i][j] = Integer.parseInt(s[j]);
            }
        }
        s = br.readLine().split(" ");
        int k = Integer.parseInt(s[1]);
        int[][] arr2 = new int[m][k];

        for (int i = 0; i < m; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < k; j++) {
                arr2[i][j] = Integer.parseInt(s[j]);
            }
        }
        int[][] arr = new int[n][k];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < m; l++) {
                    arr[i][j] += arr1[i][l] * arr2[l][j];
                }
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
