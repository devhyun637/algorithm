package algorithm.backjoon.$2009;

import java.util.Scanner;

//1, 2, 3 더하기
public class Sol9095 {
    public static void main(String[] args) {
        int[] d = new int[11];
        d[0] = 0;
        d[1] = 1;
        d[2] = 2;
        d[3] = 4;

        for (int i = 4; i < 11; i++) {
            d[i] = d[i - 1] + d[i - 2] + d[i - 3];
        }

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();
            System.out.println(d[n]);
        }
    }
}
