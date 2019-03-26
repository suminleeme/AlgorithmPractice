package DataStructure;

import java.util.Scanner;
import java.util.Stack;

public class N9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String inputs[] = input.split("");
            Stack<String> stack = new Stack<String>();

            if (inputs.length % 2 != 0 || inputs[0].equals(")")) {
                System.out.println("NO");
                continue;
            } else {
                for (int j = 0; j < inputs.length; j++) {
                    if (inputs[j].equals(")")) {
                        if (stack.empty()) {
                            stack.push(")");
                            continue;
                        }
                        String pop = stack.pop();

                        if (pop.equals(")")) {
                            stack.push(")");
                            stack.push(")");
                        }
                    } else {
                        stack.push(inputs[j]);
                    }
                }
                if (stack.empty()) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        scanner.close();
    }
}
