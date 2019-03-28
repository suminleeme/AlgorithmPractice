package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// while문 내 순서 중요 **

public class N1158_2  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("<");
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int i = m - 1;

        while (true) {
            sb.append(list.get(i));
            list.remove(i);

            if (list.size() == 0) break;

            sb.append(", ");
            i += m - 1;

            if (i >= list.size()) {
                i = i % list.size();
            }
        }
        sb.append(">");
        System.out.println(sb);
        br.close();
    }
}
