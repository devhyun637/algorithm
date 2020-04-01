package algorithm.backjoon.$2003;

import java.util.Scanner;

//1,2,3 더하기 5
public class Sol15990 {
    public static void main(String[] args) {
        long answer;
        long[][] d = new long[100001][4];

        d[1][1] = d[2][2] = d[3][3] = 1;

        for (int i = 1; i < d.length; i++) {
            if (i > 1) d[i][1] = (d[i - 1][2] + d[i - 1][3]) % 1000000009;
            if (i > 2) d[i][2] = (d[i - 2][1] + d[i - 2][3]) % 1000000009;
            if (i > 3) d[i][3] = (d[i - 3][1] + d[i - 3][2]) % 1000000009;
        }

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        while (count-- > 0) {
            int num = sc.nextInt();
            answer = (d[num][1] + d[num][2] + d[num][3]) % 1000000009;
            System.out.println(answer);
        }
    }
}
