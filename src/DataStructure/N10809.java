package DataStructure;

import java.io.*;
import java.util.ArrayList;

public class N10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<Integer> alpha = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            alpha.add(-1);
        }

        for (int i = 0; i < input.length(); i++) {
            int ascii = input.charAt(i);

            if (alpha.get(ascii - 97) != -1) continue;
            alpha.set(ascii - 97, i);
        }

        for (int i = 0; i < alpha.size(); i++) {
            System.out.print(alpha.get(i) + " ");
        }
        System.out.println();
        br.close();
    }
}
