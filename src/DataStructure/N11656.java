package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 백준 채점 결과 틀림..왤까..ArrayList에 값 넣고 정렬하는 건 같은데
// 통과 못하는 테스트케이스가 뭘까

public class N11656 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        ArrayList<String> inputs = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            String element = "";

            for (int j = i; j < input.length() ; j++) {
                element += input.charAt(j);
            }
            inputs.add(i, element);
        }

        // insertion sort
        for (int i = 1; i < inputs.size(); i++) {
            String key = inputs.get(i);

            for (int j = i - 1; j >= 0; j--) {
                char c1 = inputs.get(j).charAt(0);
                char c2 = inputs.get(i).charAt(0);

                if (c1 == c2) {
                    int shortIndex = (inputs.get(j).length() >= inputs.get(i).length()) ? i : j;
                    int CompareCharIndex = 1;

                    while (CompareCharIndex < inputs.get(shortIndex).length()) {
                        c1 = inputs.get(j).charAt(CompareCharIndex);
                        c2 = inputs.get(i).charAt(CompareCharIndex);

                        if (c1 != c2) {
                            break;
                        } else {
                            CompareCharIndex++;
                        }
                    }
                }

                if (c1 > c2) {
                    inputs.set(i, inputs.get(j));
                    inputs.set(j, key);
                    i = j;
                }
            }
        }

        for (int i = 0; i < inputs.size(); i++) {
            System.out.println(inputs.get(i));
        }
        br.close();
    }
}
