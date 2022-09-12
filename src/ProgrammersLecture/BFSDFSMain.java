package ProgrammersLecture;

import java.util.*;


class BDNode {
    String name;
    List<BDNode> links;
    boolean visited;

    public BDNode(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    void link(BDNode node) {
        links.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BDNode node = (BDNode) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    void visit() {
        this.visited = true;
    }

    boolean isVisited() {
        return this.visited;
    }
}

public class BFSDFSMain {
    public static void main(String[] args) {
        //List<BDNode> nodes = new LinkedList<>();

        BDNode a = new BDNode("A");
        BDNode b = new BDNode("B");
        BDNode c = new BDNode("C");
        BDNode d = new BDNode("D");
        BDNode e = new BDNode("E");

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

        BDNode target = e;

/*
        // BFS
        Queue<BDNode> queue = new LinkedList<>();
        queue.offer(a);

        while(!queue.isEmpty()) {
            BDNode n = queue.poll();
            n.visit();
            System.out.println(n); // 찾는 여정 출력

            if(n.equals(target)) {
                System.out.println("BFS Found! " + n);
                break;
            }

            for (BDNode l : n.links) {
                if(l.isVisited()) continue;
                if (queue.contains(l)) continue;
                queue.offer(l);
            }

            // 위랑 같은 표현
//            n.links.stream()
//                    .filter(l -> !queue.contains(l))
//                    .forEach(queue::offer);
        }
*/

        // DFS
        Stack<BDNode> stack = new Stack<>();
        stack.push(a);

        while(!stack.isEmpty()) {
            BDNode n = stack.pop();
            n.visit();
            System.out.println(n); // 찾는 여정 출력

            if (n.equals(target)) {
                System.out.println("DFS Found! " + n);
                break;
            }

            for (BDNode l : n.links) {
                if (l.isVisited()) continue;
                if (stack.contains(l)) continue;

                stack.push(l);
            }
        }


    }
}
