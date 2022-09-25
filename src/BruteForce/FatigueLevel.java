package BruteForce;

import java.util.Arrays;

// ???????? Programmers

public class FatigueLevel {
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};

        FatigueLevelSolution fatigueLevelSolution = new FatigueLevelSolution();
        fatigueLevelSolution.solution(80, dungeons);

        int answer = fatigueLevelSolution.maxCount;

        System.out.println(answer);
    }
}

class FatigueLevelSolution {
    int maxCount = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        int count = 0;
        visitDungeon(k, dungeons, visited, count);
        return maxCount;
    }

    private void visitDungeon(int energy, int[][] dungeons, boolean[] visited, int count) {
        for (int i = 0; i < dungeons.length; i++) {
            int energyRequired = dungeons[i][0];
            int energyUsed = dungeons[i][1];

            System.out.println("i : " + i);
            System.out.println("k : " + energy);
            System.out.println("energyRequired : " + energyRequired);
            System.out.println("count : " + count);
            System.out.println("visited : " + Arrays.toString(visited));

            if (!visited[i] && energy >= energyRequired) {
                visited[i] = true;

                System.out.println(i + "th====== energyUsed : " + energyUsed);
                System.out.println(i + "th====== k : " + energy);
                System.out.println(i + "th====== count : " + count);
                System.out.println(i + "th====== visited : " + Arrays.toString(visited));

                visitDungeon(energy - energyUsed, dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
        System.out.println("endFor====== count : " + count);
        System.out.println("endFor====== maxCount : " + maxCount);
        maxCount = Math.max(count, maxCount);
        System.out.println("endFor Mathmax====== maxCount : " + maxCount);
    }

    public int solution1(int k, int[][] dungeons) {
        int length = dungeons.length;
        int count = 0;
        boolean[] visited = new boolean[length];
        dfs(count, k, visited, dungeons);

        return maxCount;
    }

    public void dfs(int count, int k, boolean[] visited, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            int minFatigue = dungeons[i][0];

            System.out.println("i : " + i);
            System.out.println("k : " + k);
            System.out.println("minFatigue : " + minFatigue);
            System.out.println("count : " + count);
            System.out.println("visited : " + Arrays.toString(visited));

            if (!visited[i] && k >= minFatigue) {
                int usingFatigue = dungeons[i][1];
                k = k - usingFatigue;
                visited[i] = true;

                System.out.println(i + "th====== usingFatigue : " + usingFatigue);
                System.out.println(i + "th====== k : " + k);
                System.out.println(i + "th====== count : " + count);
                System.out.println(i + "th====== visited : " + Arrays.toString(visited));

                dfs(count + 1, k, visited, dungeons);

                visited[i] = false;
            }
        }
        System.out.println("endFor====== count : " + count);
        System.out.println("endFor====== maxCount : " + maxCount);
        maxCount = Math.max(count, maxCount);
        System.out.println("endFor Mathmax====== maxCount : " + maxCount);
    }

}