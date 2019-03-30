package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            count++;
        }
        System.out.println(count);
        br.close();
    }
}
