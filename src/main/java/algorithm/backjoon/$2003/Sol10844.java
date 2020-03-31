package algorithm.backjoon.$2003;

import java.util.Scanner;

//쉬운 계단 수
public class Sol10844 {
    public static void main(String[] args) {
        long answer = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[][] d = new long[num + 1][10];

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < 10; j++) {
                if (j != 0 && i == 1) d[1][j] = 1;

                else {
                    if (j == 0) d[i][j] = d[i - 1][j + 1];
                    else if (j == 9) d[i][j] = d[i - 1][j - 1];
                    else d[i][j] = d[i - 1][j - 1] + d[i - 1][j + 1];
                }
                d[i][j] %= 1000000000;
            }
        }

        for (int i = 0; i < 10; i++) {
            answer = (answer + d[num][i]) % 1000000000;
        }

        System.out.println(answer);
    }
}
