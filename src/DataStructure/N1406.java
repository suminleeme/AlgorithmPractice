package DataStructure;

import java.util.Scanner;
import java.util.Stack;

// scanner로 했더니 시간 초과함

public class N1406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        String input = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            stack1.push(input.charAt(i));
        }

        for (int i = 0; i < n; i++) {
            String cmd = scanner.nextLine().trim();

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
                    char push = cmd.charAt(2);
                    stack1.push(push);
                    break;

                default:
                    System.out.println("cmd 오류");
            }
        }
        String output = "";
//        StringBuffer output = new StringBuffer("") ;

        for (int j = 0; j < stack1.size(); j++) {
                output += stack1.get(j);
//            output.append(stack1.get(j));
        }

        for (int j = 0; j < stack2.size(); j++) {
                output += stack2.get(stack2.size() - j - 1);
//            output.append(stack2.size() - j - 1);
        }
        System.out.println(output);

        scanner.close();
    }
}
