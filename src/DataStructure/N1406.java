package DataStructure;

import java.io.*;
import java.util.Stack;

// Scanner로 했더니 시간 초과, StringBuilder 안써도 초과
// BufferedWriter 안쓰는게 이 예제에서는 더 빠르고 메모리도 적게 쓴다. 길이가 작아서 그런가보다
// 쓰면 : 메모리 88792KB, 시간 504ms
// bw.newLine()을 안쓰면 속도가 늘어난다 ?! 540ms
// 안쓰면(System.out.println) : 메모리 81068B, 시간 496ms

public class N1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String input = br.readLine().trim();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < input.length(); i++) {
            stack1.push(input.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            switch (cmd.charAt(0)) {
                case 'L':
                    if (stack1.empty()) {
                        continue;
                    }
                    char pop1 = stack1.pop();
                    stack2.push(pop1);
                    break;

                case 'D':
                    if (stack2.empty()) {
                        continue;
                    }
                    char pop2 = stack2.pop();
                    stack1.push(pop2);
                    break;

                case 'B':
                    if (stack1.empty()) {
                        continue;
                    }
                    stack1.pop();
                    break;

                case 'P':
                    char val = cmd.charAt(2);
                    stack1.push(val);
                    break;

                default:
                    System.out.println("cmd 오류");
            }
        }

        // StringBuffer(synchronized)보다 StringBuilder(unsynchronized)가 빠르다
        StringBuilder output = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        while (!stack2.empty()) {
            output.append(stack2.pop());
        }
        bw.write(String.valueOf(output));
        bw.newLine();
        bw.flush();
        br.close();
    }
}
