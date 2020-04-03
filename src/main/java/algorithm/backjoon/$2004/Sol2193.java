package algorithm.backjoon.$2004;

import java.util.Scanner;

//이친수
public class Sol2193 {
    public static void main(String[] args) {
        long answer;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[][] d = new long[n + 1][2];
        d[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) d[i][j] = d[i - 1][0] + d[i - 1][1];
                if (j == 1) d[i][j] = d[i - 1][0];
            }
        }

        answer = d[n][0] + d[n][1];
        System.out.println(answer);
    }
}
