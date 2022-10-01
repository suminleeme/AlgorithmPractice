package ProgrammersLecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

// node 간에 연결되었다는 걸 표기 위해 클래스 생성
class Node2 {
    static String name;
    List<Node2> links;

    public Node2(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    void link(Node2 node) {
        links.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node2 node = (Node2) o;
        return Objects.equals(name, Node2.name);
    }
}

public class GraphStudy {
    public static void main(String[] args) {
        //Graph 자바에서는 그래프 라이브러리 x, 직접구현

        // Node class에 link 속성이 생기면서 nodes linkedlist가 필요없어짐
/*        List<Node> nodes = new LinkedList<>();

        nodes.add(new Node("A"));
        nodes.add(new Node("B"));
        nodes.add(new Node("C"));
        nodes.add(new Node("D"));
        nodes.add(new Node("E"));

        System.out.println(nodes);*/

        Node2 a = new Node2("A");
        Node2 b = new Node2("B");
        Node2 c = new Node2("C");
        Node2 d = new Node2("D");
        Node2 e = new Node2("E");

        a.link(b);
        a.link(d);
        b.link(a);
        b.link(c);
        b.link(e);
        c.link(b);
        c.link(d);
        d.link(a);
        d.link(c);
        d.link(e);
        e.link(b);
        e.link(d);

        Node2 target = e;

        //BFS
        Queue<Node2> queue = new LinkedList<>();
        queue.offer(a);

        while (!queue.isEmpty()) {
            Node2 n = queue.poll();
            if (n.equals(target)) {

            }
            n.links.forEach(l -> queue.offer(l));
            //n.links.forEach(queue::offer);

        }




    }
}
