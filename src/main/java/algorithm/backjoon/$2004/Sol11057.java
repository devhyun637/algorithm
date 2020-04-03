package algorithm.backjoon.$2004;

import java.util.Scanner;

//오르막 수
public class Sol11057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = 0;
        long[][] d = new long[n + 1][10];

        for (int i = 1; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (i == 1) d[i][j] = 1;
                else {
                    for (int k = 0; k <= j; k++) {
                        if (j == 0) {
                            d[i][j] = 1;
                            break;
                        }
                        d[i][j] += d[i - 1][k] % 10007;
                    }
                }
            }
        }

        for (long l : d[n]) {
            answer += l % 10007;
        }

        System.out.println(answer % 10007);
    }
}
