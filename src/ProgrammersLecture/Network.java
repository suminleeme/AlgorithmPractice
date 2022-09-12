package ProgrammersLecture;

import java.util.*;


// 다 연결되 있는거가 몇개인지 찾는것으로, 탐색을 총 몇번 시도하는지 물어보는 것. 한 노드 잡고 깊이탐색 다하고
// 연결 안하고 남은 노드에서 깊이탐색하고 하는 긋.
class SolutionNetwork {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i=0; i<n; i++) {
            if (visited[i]) continue;
            answer++;
            visitedAllLinkedComputers(visited, computers, i);
        }

        return answer;
    }

    //주어진 값 건드리지 말란 의미로 final
    void visitedAllLinkedComputers(boolean[] visited, final int[][] computers, int c) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(c);

        // 붙어있는거에 dfs로 탐색하면서 visited처리한다.
        while (!q.isEmpty()) {
            int i = q.poll();
            visited[i] = true;

            for (int j=0; j<computers[i].length; j++) {
               if (visited[j]) continue;
               // 붙어있으면
               if (computers[i][j] == 1) {
                   q.offer(j);
               }
            }

        }

    }
}

public class Network {


    public static void main(String[] args) {
        SolutionNetwork solutionNetwork = new SolutionNetwork();
        int[][] arr1 = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}} ;
        int[][] arr2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}} ;

        System.out.println(solutionNetwork.solution(3, arr1));
        System.out.println(solutionNetwork.solution(3, arr2));

    }
}


