package DataStructure;
// java.util.Queue, LinkedList 사용

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class N10845 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String inputs[] = scanner.nextLine().split(" ");

            switch (inputs[0]) {
                case "push":
                    int val = Integer.parseInt(inputs[1]);
                    queue.add(val);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }
                    System.out.println(queue.remove());
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    if (queue.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }
                    System.out.println(queue.peek());
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        System.out.println(-1);
                        continue;
                    }
                    System.out.println(((LinkedList<Integer>) queue).getLast());
                    break;

                default:
                    System.out.println("cmd 오류");
                    break;
            }
        }
        scanner.close();
    }
}
