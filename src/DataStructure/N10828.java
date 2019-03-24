package DataStructure;
// 1. class를 따로 만듦
// 메모리 46640KB 시간 420ms

import java.util.Scanner;

public class N10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        MyStack stack = new MyStack(n);

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
                    stack.pop();
                    break;
                case "size":
                    stack.size();
                    break;
                case "empty":
                    stack.empty();
                    break;
                case "top":
                    stack.top();
                    break;
                default:
                    System.out.println("cmd 오류");
            }
        }
        scanner.close();
    }
}

class MyStack {
    int top; // 0~
    int[] arr;

    public MyStack(int n) {
        this.arr = new int[n];
        this.top = -1;
    }

    public void push(int val) {
        top++;
        arr[top] = val;
    }

    public void pop() {
        if (top == -1) {
            System.out.println(-1);
        }
        else {
            System.out.println(arr[top]);
            top--;
        }
    }

    public void size() {
        System.out.println(top + 1);
    }

    public void empty() {
        if (top == -1) System.out.println(1);
        else System.out.println(0);
    }

    public void top() {
        if (top == -1) {
            System.out.println(-1);
        } else {
            System.out.println(arr[top]);
        }
    }
}
