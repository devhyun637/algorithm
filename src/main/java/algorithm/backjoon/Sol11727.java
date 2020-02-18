package algorithm.backjoon;

import java.util.Scanner;

//2xn 타일링 2
public class Sol11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] p = new int[10000];

        p[0] = 1;
        p[1] = 1;

        for (int i = 3; i <= num; i++) {
            p[i] = p[i - 1] + (p[i - 2] * 2);
            p[i] = p[i] % 10007;
        }
        System.out.println(p[num]);
    }
}
