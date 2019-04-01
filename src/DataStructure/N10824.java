package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 자료형 주의

public class N10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String r1 = st.nextToken() + st.nextToken();
        String r2 = st.nextToken() + st.nextToken();

        long result = Long.parseLong(r1) + Long.parseLong(r2);
        System.out.println(result);

        br.close();
    }
}
