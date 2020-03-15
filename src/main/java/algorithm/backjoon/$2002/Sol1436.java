package algorithm.backjoon.$2002;

import java.util.Scanner;

//1로만들기 -Dynamic programming
public class Sol1436 {
    public static void main(String[] args) {
        int[] memo = new int[10000000];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        memo[1] = 0;
        for (int i = 2; i <= num; i++) {
            memo[i] = memo[i - 1] + 1;

            if (i % 2 == 0) {
                if (memo[i / 2] + 1 < memo[i]) memo[i] = (memo[i / 2] + 1);
            }

            if (i % 3 == 0) {
                if (memo[i / 3] + 1 < memo[i]) memo[i] = (memo[i / 3] + 1);
            }
        }

        System.out.println(memo[num]);
    }
}
