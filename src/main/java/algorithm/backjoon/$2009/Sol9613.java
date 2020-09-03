package algorithm.backjoon.$2009;

import java.util.Scanner;

//GCD의 합
public class Sol9613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            long answer = 0;
            int num = sc.nextInt();
            int[] arr = new int[num];

            for (int j = 0; j < num; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < num; j++) {
                for (int k = j + 1; k < num; k++) {
                    answer += gcd(arr[j], arr[k]);
                }
            }

            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
