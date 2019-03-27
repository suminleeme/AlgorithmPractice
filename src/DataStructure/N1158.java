package DataStructure;

import java.util.*;

public class N1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CircularLinkedList cl = new CircularLinkedList();
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            cl.insertLastNode(i + 1);
        }
        boolean flag = true;
        System.out.print("<");
        while (flag == true) {
            flag = cl.deleteAndPrintNode(m);
        }
        System.out.print(">");
        System.out.println();
        scanner.close();
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private ListNode CL;

    public CircularLinkedList() {
        this.CL = null;
    }

    void insertLastNode(int data) {
        ListNode node = new ListNode(data);

        if (CL == null) {
            CL = node;
            node.next = node;
        } else {
            ListNode current = CL;
            node.next = current.next;
            current.next = node;
            CL = node;
        }
    }

    boolean deleteAndPrintNode(int index) {
        if (CL == null) {
           return false;
        } else if (CL.next == CL) {
            System.out.print(CL.data);
            return false;
        } else {
            ListNode current = CL;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            ListNode del = current.next;
            System.out.print(del.data + ", ");
            current.next = del.next;
            CL = current;
            return true;
        }
    }
}
