package ProgrammersLecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

class Node {
    String name;
    List<Node> links;
    boolean visited;

    public Node(String name) {
        this.name = name;
        this.links = new LinkedList<>();
    }

    @Override
    public String toString() {
        return name;
    }

    void link(Node node) {
        links.add(node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    boolean isVisited() {
        return this.visited;
    }

}

class SolutionNetworkMy {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<Node> nodes = new LinkedList<>();

        for(int i=0; i<n; i++) {
            nodes.add(new Node(Integer.toString(i)));
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i != j && computers[i][j] == 1) {
                    Node nn = nodes.get(i);
                    nn.link(nodes.get(j));
                }
            }
        }

        int networkN = 0;

        //DFS
        Stack<Node> stack = new Stack<>();
        stack.push(nodes.get(0));

        while(!stack.isEmpty()) {
            Node a = stack.pop();
            a.visited = true;
            networkN++;
      //      System.out.println(a);

            for(Node l : a.links) {
                if(l.isVisited()) continue;
                if(stack.contains(l)) continue;
                stack.push(l);
            }

        }

        answer = networkN;

        return answer;
    }
}

public class NetworkMy {

    public static void main(String[] args) {
        SolutionNetworkMy solutionNetwork = new SolutionNetworkMy();
        int[][] arr1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}} ;
        int[][] arr2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}} ;

        System.out.println(solutionNetwork.solution(3, arr1));
        System.out.println(solutionNetwork.solution(3, arr2));

    }
}



