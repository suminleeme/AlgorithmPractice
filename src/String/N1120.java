package String;

import java.io.*;
import java.util.Arrays;

public class N1120 {
    public static void main(String[] args) throws IOException {
        // 문자열 A, B 입력받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] s = br.readLine().trim().split(" ");
        String[] a = s[0].split("");
        String[] b = s[1].split("");
        int lenDif = b.length - a.length + 1;
        int dif = 0;
        int[] difArray = new int[lenDif];

        // A를 B 제일 앞에서부터 하나씩 밀면서 차이 비교
        for (int i = 0; i < lenDif; i++) {
            dif = 0;

            for (int j = 0; j < a.length; j++) {
                if (!(b[i + j].equals(a[j]))) dif++;
            }
            difArray[i] = dif;
        }

        // 차이가 가장 작을 때 그 차이 출력
        Arrays.sort(difArray);
        bw.write(difArray[0] + "\n");
        bw.flush();
        bw.close();
    }
}
