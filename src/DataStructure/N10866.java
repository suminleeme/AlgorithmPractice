package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class N10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front":
                    int val_f = Integer.parseInt(st.nextToken());
                    dq.addFirst(val_f);
                    break;

                case "push_back":
                    int val_b = Integer.parseInt(st.nextToken());
                    dq.addLast(val_b);
                    break;

                case "pop_front":
                    if (dq.isEmpty()) System.out.println(-1);
                    else {
                        int pop_f = dq.remove();
                        System.out.println(pop_f);
                    }
                    break;

                case "pop_back":
                    if (dq.isEmpty()) System.out.println(-1);
                    else {
                        int pop_b = dq.removeLast();
                        System.out.println(pop_b);
                    }
                    break;

                case "size":
                    System.out.println(dq.size());
                    break;

                case "empty":
                    if (dq.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;

                case "front":
                    if (dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.peek());
                    break;

                case "back":
                    if (dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.peekLast());
                    break;

                default:
            }
        }
        br.close();
    }
}
