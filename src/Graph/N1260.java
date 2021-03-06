package Graph;

import java.util.*;

public class N1260 {
    private void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        ArrayList<Integer>[] a = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            a[v1].add(v2);
            a[v2].add(v1);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }

        boolean[] c = new boolean[n + 1];
        Arrays.fill(c, false);

        dfs(a, c, v);
        System.out.println();
        Arrays.fill(c, false);
        bfs(a, c, v);
        sc.close();
    }

    static void dfs(ArrayList<Integer>[] a, boolean[] c, int v) {
        if (c[v]) return;

        c[v] = true;
        System.out.print(v + " ");

        for (int vv : a[v]) {
            if (!c[vv]) {
                dfs(a, c, vv);
            }
        }
    }

    static void bfs(ArrayList<Integer>[] a, boolean[] c, int v) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        c[v] = true;

        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");

            for (int vv : a[v]) {
                if (!c[vv]) {
                    q.add(vv);
                    c[vv] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        new N1260().solve();
    }
}
