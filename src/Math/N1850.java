package Math;

import java.util.Scanner;
// 검색해서 풀음

public class N1850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < gcd(a, b); i++) {
            sb.append(1);
        }
        System.out.println(sb);
        sc.close();
    }

    static long gcd(long a, long b) {
        while (b > 0) {
            long tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
