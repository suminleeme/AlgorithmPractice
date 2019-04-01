package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class N11656_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> inputs = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            inputs.add(input.substring(i));
        }

        Collections.sort(inputs);

        for (String i : inputs) {
            System.out.println(i);
        }
    }
}
