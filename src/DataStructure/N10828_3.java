package DataStructure;
// 3. 자바 컬렉션 - list의 Stack 사용해도 된다.
// 메모리 46820KB 시간 440ms

import java.util.Scanner;
import java.util.Stack;

public class N10828_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String s[] = str.split(" ");
            String cmd = s[0];

            switch (cmd) {
                case "push" :
                    int val = Integer.parseInt(s[1]);
                    stack.push(val);
                    break;

                case "pop":
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.empty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "top":
                    if (stack.empty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;

                default:
                    System.out.println("cmd 오류");
            }
        }
        scanner.close();
    }
}
