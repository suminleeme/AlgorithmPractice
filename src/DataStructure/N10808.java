package DataStructure;

import java.io.*;
import java.util.ArrayList;

// 틀림

public class N10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Integer> alpha = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            alpha.add(0);
        }

        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);
            int element = alpha.get(ascii - 97);
            alpha.set(ascii - 97, element + 1);
        }

        for (int i = 0; i < alpha.size(); i++) {
            System.out.print(alpha.get(i));
        }
        System.out.println();
        br.close();
    }
}
