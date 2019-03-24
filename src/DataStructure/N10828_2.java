package DataStructure;
// 2. 그냥 main 안에서 myStack2 구현
// 메모리 46492KB 시간 424ms

import java.util.Scanner;

public class N10828_2 {
    public static void main(String[] args) {
        int top = -1; // 0~
        int[] myStack2;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        myStack2 = new int[n];

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            String s[] = str.split(" ");
            String cmd = s[0];

            switch (cmd) {
                case "push" :
                    int val = Integer.parseInt(s[1]);
                    top++;
                    myStack2[top] = val;
                    break;

                case "pop":
                    if (top == -1) {
                        System.out.println(-1);
                    }
                    else {
                        System.out.println(myStack2[top]);
                        top--;
                    }
                    break;

                case "size":
                    System.out.println(top + 1);
                    break;

                case "empty":
                    if (top == -1) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "top":
                    if (top == -1) {
                        System.out.println(-1);
                    } else {
                        System.out.println(myStack2[top]);
                    }
                    break;

                default:
                    System.out.println("cmd 오류");
            }
        }
        scanner.close();
    }
}